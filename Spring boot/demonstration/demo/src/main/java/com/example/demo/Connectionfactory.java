package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connectionfactory{
    String url = "jdbc:postgresql:DevinMagalu";
        String user = "postgres";
        String password = "Boxe1440";

        public Connection getConnection() throws SQLException{
            return DriverManager.getConnection(url, user, password);
        }
    
}