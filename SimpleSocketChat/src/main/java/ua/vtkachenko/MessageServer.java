package ua.vtkachenko;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class MessageServer {

    private int port = 6666;
    private List<Connection> connections =
            Collections.synchronizedList(new ArrayList<Connection>());
    private ServerSocket server;

    public MessageServer() {
        try {
            server = new ServerSocket(port);
            int count = 0;
            System.out.println("Server wait for clients");
            while (true) {
                Socket socket = server.accept();
                count++;
                System.out.println("Client " + count + " connected");
                Connection con = new Connection(socket);
                connections.add(con);
                con.start();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeAll();
        }
    }

    private void closeAll() {
        try {
            server.close();
            synchronized(connections) {
                Iterator<Connection> iter = connections.iterator();
                while(iter.hasNext()) {
                    ((Connection) iter.next()).close();
                }
            }
        } catch (Exception e) {
            System.err.println("Connections wasn't closed");
        }
    }

    private class Connection extends Thread {
        private BufferedReader in;
        private PrintWriter out;
        private Socket socket;

        private String name = "";

        public Connection(Socket socket) {
            this.socket = socket;

            try {
                in = new BufferedReader(new InputStreamReader(
                        socket.getInputStream()));
                out = new PrintWriter(socket.getOutputStream(), true);

            } catch (IOException e) {
                e.printStackTrace();
                close();
            }
        }

        @Override
        public void run() {
            try {
                name = in.readLine();
                synchronized(connections) {
                    Iterator<Connection> iter = connections.iterator();
                    while(iter.hasNext()) {
                        ((Connection) iter.next()).out.println(name + " join conversation");
                    }
                }

                String str = "";
                while (true) {
                    str = in.readLine();
                    if(str.equals("exit")) break;

                    synchronized(connections) {
                        Iterator<Connection> iter = connections.iterator();
                        boolean notPrivateMessage = true;
                        while(iter.hasNext()) {
                            Connection currConnection = (Connection) iter.next();
                            if (str.contains(currConnection.name + ":")){
                                currConnection.out.println(name + ": " + str.replace(currConnection.name + ": ", "") + "(private message)");
                                notPrivateMessage = false;
                            } else {
                                if (! currConnection.name.equals(name) && notPrivateMessage){
                                    currConnection.out.println(name + ": " + str);
                                }
                            }
                        }
                    }
                }

                synchronized(connections) {
                    Iterator<Connection> iter = connections.iterator();
                    while(iter.hasNext()) {
                        ((Connection) iter.next()).out.println(name + " left conversation");
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                close();
            }
        }

        public void close() {
            try {
                in.close();
                out.close();
                socket.close();

                connections.remove(this);
                if (connections.size() == 0) {
                    MessageServer.this.closeAll();
                    System.exit(0);
                }
            } catch (Exception e) {
                System.err.println("Connections wasn't closed");
            }
        }
    }

    public static void main(String[] args) {
        new MessageServer();
    }
}

