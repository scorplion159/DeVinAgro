package com.example.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TesteConexão {
    public static void main(String[] args) throws SQLException {

        String url = "jdbc:postgresql:DevinMagalu";
        String user = "postgres";
        String password = "Boxe1440";



        Connection connection = DriverManager.getConnection(url, user, password) ;
        Statement statement =connection.createStatement();
        System.out.println( statement.execute("select id,nome,descricao from produtos"));
            System.out.println(connection.getSchema());
            ResultSet set =statement.getResultSet();
            while(set.next()){
                int id = set.getInt("id");
                String nome = set.getString("nome");
                String descricao =set.getString("descricao");
                System.out.println(nome);
            }
    }
}
        

