package com.viceri.viceri.viceri.service;

import java.util.List;

public interface CRUDTarefaService<Tarefa> {
    List<Tarefa> findAll();
    Tarefa finById(int id);
    int add (Tarefa t);
    Tarefa update(int id,Tarefa t);
    Tarefa delete(int id);
    Tarefa save(Tarefa u);
    Tarefa completa(Tarefa tarefa);
    
}
