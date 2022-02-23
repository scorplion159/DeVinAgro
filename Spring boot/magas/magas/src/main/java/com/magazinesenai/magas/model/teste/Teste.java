package com.magazinesenai.magas.model.teste;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produtos")
public class Teste {
    @Id
    @GeneratedValue()
    private long id;
    private String nome;


    
}
