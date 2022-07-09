package server;


import dto.impl.UserDTO;
import lombok.extern.slf4j.Slf4j;
import network.Request;
import network.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

@Slf4j
public class ClientHandler extends Thread {

    private final Socket socket;

    private final ObjectOutputStream toClient;

    private final ObjectInputStream fromClient;

    private final Server server;

    private Boolean running;

    private UserDTO loggedUser;

    public ClientHandler(Socket socket, Server server) throws IOException {
        this.socket = socket;
        this.server = server;
        toClient = new ObjectOutputStream(socket.getOutputStream());
        fromClient = new ObjectInputStream(socket.getInputStream());
    }

    public Socket getSocket() {
        return socket;
    }

    public UserDTO getLoginUser() {
        return loggedUser;
    }

    @Override
    public void run() {
        running = true;

        while (running){
            try {
                Request request = (Request) fromClient.readObject();
                Response response = handleRequest(request);

            } catch (IOException | ClassNotFoundException e) {
                log.error("Failed reading request or sending response data  from/to client: " + e.getMessage());
        }

    }
}

    private Response handleRequest(Request request) {
        switch (request.getRequestType()){
            case LOGIN:
        }

        return null;
    }
}
