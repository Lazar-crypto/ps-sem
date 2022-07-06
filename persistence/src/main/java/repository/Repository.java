package repository;

import database.ConnectionPool;
import java.sql.Connection;

public class Repository {
    
    final Connection connection;

    public Repository() {
        this.connection = ConnectionPool.getConnection();
    }
    
}
