package ua.vtkachenko;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class MessageClient{

    private int port;
    private String ip;
    private static volatile boolean stopClient = false;

    public MessageClient(String ip, int port){
        this.ip = ip;
        this.port = port;
    }

    public void setStopClient(boolean stopClient) {
        this.stopClient = stopClient;
    }

    public boolean isStopClient() {
        return stopClient;
    }

    public void start() {
        try {
            InetAddress ipAddress = InetAddress.getByName(ip);
            Socket socket = new Socket(ipAddress, port);
            InputStream inStream = socket.getInputStream();
            OutputStream outStream = socket.getOutputStream();
            DataInputStream in = new DataInputStream(inStream);
            DataOutputStream out = new DataOutputStream(outStream);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;
            while (!stopClient) {
                line = keyboard.readLine();
                out.writeUTF(line);
                out.flush();
                line = in.readUTF();
                System.out.println("Server answer : " + line);
            }
            if (stopClient) System.out.println("Client was stopped");
        } catch (Exception x) {
            x.printStackTrace();
        }
    }

//    public boolean sendMessage(String messageOwner, String message) {
//        return false;
//    }
}
