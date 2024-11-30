package uff.empresaluz.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5432/empresaluz";
    private static final String USER = "user";
    private static final String PASSWORD = "admin";    // URL de conexão com o banco

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
