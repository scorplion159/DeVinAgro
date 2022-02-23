package com.example.demo;

import java.sql.Connection;

public class ProdutoDAO {
    public void vdadastra(Produto){String sql = "INSERT INTO proudtos(nome,descricao) VALUES(?,?)"}
    private Connectionfactory con;


    public ProdutoDAO(Connectionfactory con) {
        this.con = con;
    }


}
