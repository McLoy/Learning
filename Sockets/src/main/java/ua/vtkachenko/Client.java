package ua.vtkachenko;

import java.net.*;
import java.io.*;

public class Client {
    public static void main(String[] ar) {
        int serverPort = 6666;
        String address = "127.0.0.1"; // это IP-адрес компьютера, где исполняется наша серверная программа.
        //String address = "192.168.0.102"; //102 - tel, 106 comp
        try {
            InetAddress ipAddress = InetAddress.getByName(address);
            Socket socket = new Socket(ipAddress, serverPort);
            InputStream sin = socket.getInputStream();
            OutputStream sout = socket.getOutputStream();
            DataInputStream in = new DataInputStream(sin);
            DataOutputStream out = new DataOutputStream(sout);
            BufferedReader keyboard = new BufferedReader(new InputStreamReader(System.in));
            String line = null;

            while (true) {
                line = keyboard.readLine();
                out.writeUTF(line);
                out.flush();
                line = in.readUTF();
                System.out.println("Server answer : " + line);
            }
        } catch (Exception x) {
            x.printStackTrace();
        }
    }
}
