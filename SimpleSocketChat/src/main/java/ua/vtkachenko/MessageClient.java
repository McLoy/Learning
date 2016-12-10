package ua.vtkachenko;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class MessageClient{

    private int port;
    private String ip;

    public MessageClient(int port, String ip) {
        this.port = port;
        this.ip = ip;
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
            System.out.println("Client started:");
            while (true) {
                line = keyboard.readLine();
                out.writeUTF(line);
//                System.out.println(text);
//                if (text.length() != 0) {
//                    System.out.println(text);
//                    out.writeUTF(text);
                    out.flush();
                    line = in.readUTF();
//                }
//                text = "";
//                System.out.println("Answer: " + answer);
                if (line.length() != 0){
                    System.out.println("Server answer : " + line);
                }
            }
//            System.out.println("Client was stopped");
        } catch (Exception x) {
            System.out.println("Error ->" + x.getMessage());
            x.printStackTrace();
        }
    }

    public static void main(String[] args) {
        MessageClient client = new MessageClient(6666, "127.0.0.1");
        client.start();
    }

}
