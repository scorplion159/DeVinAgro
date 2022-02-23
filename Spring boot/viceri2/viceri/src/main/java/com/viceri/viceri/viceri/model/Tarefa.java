package com.viceri.viceri.viceri.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Data;


@Entity
@Data
public class Tarefa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    
    private long id;
  
    private String descricao;
    
    private boolean tarefaConcluida;
    private EnumPrioridade prioridade;
    public Tarefa(long id, String descricao, boolean tarefaConcluida, EnumPrioridade prioridade) {
        this.id = id;
        this.descricao = descricao;
        this.tarefaConcluida = tarefaConcluida;
        this.prioridade = prioridade;
    }


    
}
