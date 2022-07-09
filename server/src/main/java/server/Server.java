package server;

import dto.impl.UserDTO;
import lombok.extern.slf4j.Slf4j;
import server.properties.ServerProperties;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

@Slf4j
public class Server extends Thread{

     private final ServerSocket serverSocket;
     private final List<ClientHandler> clients;

     Boolean running = true;

    public Server() throws IOException {
        serverSocket = new ServerSocket(Integer.parseInt(ServerProperties.getInstance().getProperty("server_port")));
        clients = new ArrayList<>();
    }


    @Override
    public void run() {
        log.info("Server listening on port: " + serverSocket.getLocalPort());

        while (running){
            try (Socket socket = serverSocket.accept()) {
                ClientHandler clientHandler = new ClientHandler(socket,this);
                clients.add(clientHandler);
                clientHandler.start();

            } catch (IOException e) {
                log.error("Client did not connect: " + e.getMessage());
            }
        }
        stopAllThreads();
    }

    private void stopAllThreads() {
        for (ClientHandler client : clients) {
            try {
                client.getSocket().close();

            } catch (IOException ex) {
                log.error("Client thread failed to stop: " + ex.getMessage());
            }
        }
    }

    public void terminate() {
        running = false;
        try {
            serverSocket.close();

        } catch (IOException e) {
            log.error("Failed to terminate server" + e.getMessage());
        }
    }

    public List<UserDTO> getAllUsers() {
        List<UserDTO> users = new ArrayList<>();

        for (ClientHandler client : clients) {
            users.add(client.getLoginUser());
        }
        return users;
    }
}
