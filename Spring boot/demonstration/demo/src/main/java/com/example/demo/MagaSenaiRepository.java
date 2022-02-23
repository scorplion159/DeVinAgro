package com.example.demo;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MagaSenaiRepository {public static void main(String[] args) throws Exception {
    Connectionfactory factory = new Connectionfactory();
    Connection con =factory.getConnection();
    
    Statement stt = (Statement) con.createStatement();
    stt.execute("insert into (nome,descricao,preco,qtd_estoque)" +"values('livro','livro',100,30)");
    ResultSet set =((java.sql.Statement) stt).getResultSet();
}
    
    
}
