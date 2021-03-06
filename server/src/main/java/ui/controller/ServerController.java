package ui.controller;

import dto.impl.UserDTO;
import java.io.IOException;

import lombok.extern.java.Log;
import server.Server;
import ui.table.model.UsersTableModel;
import ui.view.ServerForm;

@Log
public class ServerController {

    private static ServerController instance;
    
    private final ServerForm serverForm;
    
    private Server server;
    
     private ServerController() {
        serverForm = new ServerForm();
        setListeners();
    }

    public static ServerController getInstance() {
        if (instance == null) instance = new ServerController();
        return instance;
    }
    
    public void show(){
        serverForm.setVisible(true);
    }

    private void setListeners() {
        serverForm.getBtnStartServer().addActionListener(a -> startServer());
        serverForm.getBtnStopServer().addActionListener(a -> stopServer());
    }

    private void startServer() {
         log.info("Server STARTED");
         try {
            server = new Server();
        } catch (IOException ex) {
             log.info("Cannot instantiate Server");
            serverForm.printError("Greska prilikom pokretanja servera!");
        }
         server.start();
         serverForm.serverStarted();
    }

    private void stopServer() {
        log.info("server STOPPED");
         if (((UsersTableModel)serverForm.getTblActiveUsers().getModel()).getActiveUsers().size() > 0){
            serverForm.printError("Postoje aktivni korisnici!");
           
            if(serverForm.confirmDialog("Da li ste sigurni da zelite da ugasite server?")){
                server.terminate();
                serverForm.serverStopped();
            }
        }
        server.terminate();
        serverForm.serverStopped();
    }
    
    public void addUser(UserDTO user){
        ((UsersTableModel)serverForm.getTblActiveUsers().getModel()).addUser(user);
    }

    public void removeUser(UserDTO user){
        ((UsersTableModel)serverForm.getTblActiveUsers().getModel()).removeUser(user);
    }
    
}
