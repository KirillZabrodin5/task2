package org.example;

import java.io.IOException;
import java.net.Socket;
import java.net.InetSocketAddress;

public class Task5 implements Task {
    private String host;
    private int startPort;
    private int endPort;
    private volatile boolean running;

    public Task5(String host, int startPort, int endPort) {
        this.host = host;
        this.startPort = startPort;
        this.endPort = endPort;
    }

    @Override
    public void start() {
        running = true;

        for (int port = startPort; port <= endPort; port++) {
            if (!running) {
                System.out.println("Scanning stopped.");
                break;
            }

            try (Socket socket = new Socket()) {
                socket.connect(new InetSocketAddress(host, port), 200);
                System.out.println("Port " + port + " is open.");
            } catch (IOException e) {
                // порт закрыт или недоступен
            }
        }

        if (running) {
            System.out.println("Scanning completed.");
        }
    }

    @Override
    public void stop() {
        running = false;
    }

    public static void main(String[] args) {
        Task5 scanner = new Task5("localhost", 1, 1024);

        Thread scanThread = new Thread(scanner::start);
        scanThread.start();

        // чтобы остановить сканирование, можно вызвать Scanner.stop() из другого потока
    }
}


interface Task {
    void start();
    void stop();
}
