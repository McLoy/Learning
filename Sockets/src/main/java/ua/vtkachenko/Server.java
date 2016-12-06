package ua.vtkachenko;

import java.net.*;
import java.io.*;
public class Server {
    public static void main(String[] ar)    {
        int port = 6666;
        try {
            ServerSocket ss = new ServerSocket(port);
            Socket socket = ss.accept();
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            String line = null;
            while(true) {
                line = in.readUTF();
                System.out.println("Client send: " + line);
                out.writeUTF("Yep!");
                out.flush();
            }
        } catch(Exception x) { x.printStackTrace(); }
    }
}
