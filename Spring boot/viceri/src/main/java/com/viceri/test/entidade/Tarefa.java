package com.viceri.test.entidade;

public class Tarefa {
    private Long id;
    private String descricao;
    private boolean tarefaCompleta= false;

    
   
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean isTarefaCompleta() {
        return tarefaCompleta;
    }

    public void setTarefaCompleta(boolean tarefaCompleta) {
        this.tarefaCompleta = tarefaCompleta;
    }

    public Tarefa(Long id, String descricao, boolean tarefaCompleta) {
        this.id = id;
        this.descricao = descricao;
        this.tarefaCompleta = tarefaCompleta;
    }

    
    
}
