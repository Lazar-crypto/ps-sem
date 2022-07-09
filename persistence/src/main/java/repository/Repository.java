package repository;

import database.ConnectionPool;
import java.sql.Connection;

public class Repository {
    
    private final Connection connection;

    public Repository() {
        this.connection = ConnectionPool.getConnection();
    }
    
}
