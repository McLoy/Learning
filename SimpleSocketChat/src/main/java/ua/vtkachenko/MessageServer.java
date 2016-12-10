package ua.vtkachenko;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MessageServer {

    private int port;
    private static volatile boolean stopServer = false;

    public MessageServer(int port) {
        this.port = port;
    }

    public void start() {
        try {
            ServerSocket server = new ServerSocket(port);
            Socket serverSocket = server.accept();
            OutputStream outStream = serverSocket.getOutputStream();
            InputStream inStream = serverSocket.getInputStream();
            DataInputStream in = new DataInputStream(inStream);
            DataOutputStream out = new DataOutputStream(outStream);
            String line = null;
            while(!stopServer) {
                line = in.readUTF();
                System.out.println("Client send: " + line);
//                out.writeUTF("Yep!");
//                out.flush();
            }
            if (stopServer) System.out.println("Server was stopped");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void setStopServer(boolean stopServer) {
        MessageServer.stopServer = stopServer;
    }
}
