package ua.vtkachenko;

import org.fest.assertions.Assertions;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MessageClientTest {

//    private String ip;
//    private int port;
//    private static volatile MessageServer server;
//    private static volatile MessageClient client;
//
//    private Thread serverThread;
//    private Thread clientThread;
//
//    @Before
//    public void setUp() throws Exception {
//        ip = "127.0.0.1";
//        port = 6666;
//
//        serverThread = new Thread() {
//            @Override
//            public void run() {
//                server = new MessageServer(port);
//                server.start();
//            }
//        };
//        serverThread.start();
//
//        clientThread = new Thread() {
//            @Override
//            public void run() {
//                client = new MessageClient(ip, port);
//                client.start();
//            }
//        };
//        clientThread.start();
//    }
//
//    @Test
//    public void connect() throws Exception {
//        Assertions.assertThat(clientThread.isAlive()).isTrue();
//    }
//
//    @Test
//    public void getDefaultServerAnswer() throws Exception {
////        client.sendMessage("Default");
//
//        Assertions.assertThat(client.sendMessage("Default")).isEqualTo("Default answer");
//    }
//
//    @After
//    public void finishThread() throws Exception {
//        client.stop();
//        server.stop();
//    }
}
