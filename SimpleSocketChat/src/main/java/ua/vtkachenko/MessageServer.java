package ua.vtkachenko;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MessageServer {

    private int port;
    private DataInputStream in;
    private DataOutputStream out;

    public MessageServer(int port) {
        this.port = port;
    }

    public void init() {
        try {
            ServerSocket server = new ServerSocket(port);
            Socket serverSocket = server.accept();
            OutputStream outStream = serverSocket.getOutputStream();
            InputStream inStream = serverSocket.getInputStream();
            in = new DataInputStream(inStream);
            out = new DataOutputStream(outStream);
//            String line = null;
//            System.out.println("Server was stopped");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public DataInputStream getIn() {
        return in;
    }

    public DataOutputStream getOut() {
        return out;
    }

    public static void main(String[] args) {

        MessageServer server = new MessageServer(6666);
        server.init();
        DataInputStream in = server.getIn();
        DataOutputStream out = server.getOut();
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        String line, to;
        List<String> users = new ArrayList<String>();
        System.out.println("Server started:");
        int answerCounts = 1;
        while (!exit){
            try {
                line = in.readUTF();
                if (line.length() != 0 /*&& line.contains(":")*/){
//                    to = line.substring(0, line.indexOf(":") - 1);
//                    if (users.contains(to)){
                        //send message

                    if (line.equals("exit")){
                        exit = true;
                    } else {
                        out.writeUTF("Hello from server " + answerCounts++);
                    out.flush();
                    }
//                    }
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }

//            command = scan.nextLine();
//            if (command.equals("exit")){
//                exit = true;
//            } else {
//                System.out.println("Command '" + command + "' not found, try 'exit' for exit");
//            }
        }
        System.out.println("Message server stopped");
    }
}
