/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacteo;

import java.io.*;
import java.net.Socket;
import javafx.application.Platform;
/**
 *
 * @author Omar Awad
 */
public class ClientSide extends Thread {
    Socket playerSocket;
    DataInputStream playerDataInput;
    PrintStream playerPrintStream;
    static String user;
    static Integer score;
    static String dataListened;

    public ClientSide() {
        try {
            playerSocket = new Socket("127.0.0.1", 5000);
            playerDataInput = new DataInputStream(playerSocket.getInputStream());
            playerPrintStream = new PrintStream(playerSocket.getOutputStream());
            start();
        } catch (IOException exc) {
            System.out.println("");
        }
    }
    @Override
    public void run() {
        while (true) {
            try {
                dataListened = playerDataInput.readLine();  
//                System.out.println(message);
            } catch (IOException exc) {
                System.out.println("");
            }
            Platform.runLater(new Runnable() {
                @Override
                public void run() {
                    OnLineGamePage.messageFromeServer(dataListened);
                }
            });
        }
    }
}
