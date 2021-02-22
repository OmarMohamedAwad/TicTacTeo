/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictacteoserverside;

import java.io.*;
import java.net.*;

/**
 *
 * @author Omar Awad
 */
public class ServerSide {

    ServerSocket serverSocket;

    public ServerSide() {
        try {
            serverSocket = new ServerSocket(10000);
            while (true) {
                Socket socket = serverSocket.accept();
                new GameHandler(socket);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
