package com.curso.demo.model;

import java.sql.Date;
import java.util.List;

public class Curso {
    private String nome;
    private Date data;
    private List<String> nomesDosAlunos;
    public Curso(String nome, Date data, List<String> nomesDosAlunos) {
        this.nome = nome;
        this.data = data;
        this.nomesDosAlunos = nomesDosAlunos;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Date getData() {
        return data;
    }
    public void setData(Date data) {
        this.data = data;
    }
    public List<String> getNomesDosAlunos() {
        return nomesDosAlunos;
    }
    public void setNomesDosAlunos(List<String> nomesDosAlunos) {
        this.nomesDosAlunos = nomesDosAlunos;
    }
    
}
