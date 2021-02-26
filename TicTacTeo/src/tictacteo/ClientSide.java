/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacteo;

import java.io.*;
import java.net.Socket;

/**
 *
 * @author Omar Awad
 */
public class ClientSide extends Thread {
    Socket playerSocket;
    DataInputStream playerDataInput;
    PrintStream playerPrintStream;

    public ClientSide() {
        try {
            playerSocket = new Socket("127.0.0.1", 10000);
            playerDataInput = new DataInputStream(playerSocket.getInputStream());
            playerPrintStream = new PrintStream(playerSocket.getOutputStream());
            start();
        } catch (IOException exc) {
            exc.printStackTrace();
        }
    }

    public void run() {
        while (true) {
            try {
                String dataListened = playerDataInput.readLine();
                OnLineGamePage.messageFromeServer(dataListened);
//                System.out.println(message);
            } catch (IOException exc) {
                exc.printStackTrace();
            }
        }
    }
}
