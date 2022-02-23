package com.viceri.viceri.viceri.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private List <Tarefa> listaTarefa = new ArrayList<>();
    public Usuario(Long id, String email, List<Tarefa> listaTarefa) {
        this.id = id;
        this.email = email;
        this.listaTarefa = listaTarefa;
    }
    
}
