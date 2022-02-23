package com.viceri.test.entidade;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Usuario {
    @Id
    private Long id;


    private String email;
    private String senha;
    @OneToMany
    private List<Tarefa> listaTarefas;
    
    public Usuario(Long id, String email, String senha, List<Tarefa> listaTarefas) {
        this.id = id;
        this.email = email;
        this.senha = senha;
        this.listaTarefas = listaTarefas;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public List<Tarefa> getListaTarefas() {
        return listaTarefas;
    }
    public void setListaTarefas(List<Tarefa> listaTarefas) {
        this.listaTarefas = listaTarefas;
    }
    
}
