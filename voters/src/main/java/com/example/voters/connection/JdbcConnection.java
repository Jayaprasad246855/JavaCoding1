package com.example.voters.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcConnection {
    public static Connection getConnection() {
        String url="jdbc:h2:mem:demo";
        String userName="sa";
        String password="";
        Connection connection=null;
        try {
            Class.forName("org.h2.Driver");
            connection= DriverManager.getConnection(url, userName, password);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return connection;
    }
}
