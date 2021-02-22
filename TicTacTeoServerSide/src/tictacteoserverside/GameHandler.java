/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacteoserverside;

import java.io.*;
import java.net.*;
import java.util.Vector;

/**
 *
 * @author Omar Awad
 */
public class GameHandler extends Thread {

    DataInputStream serverDataInput;
    PrintStream serverPrintStreem;
    static Vector<GameHandler> clientsList = new Vector<GameHandler>();

    public GameHandler(Socket clientSocket) {
        try {
            serverDataInput = new DataInputStream(clientSocket.getInputStream());
            serverPrintStreem = new PrintStream(clientSocket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
        clientsList.add(this);
        start();

    }

    @Override
    public void run() {
        while (true) {
            try {
                String strMove = serverDataInput.readLine();
                sendMoveToClients(strMove);
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public void sendMoveToClients(String strMove) {
        for (GameHandler ch : clientsList) {
            ch.serverPrintStreem.println(strMove);
        }
    }
}