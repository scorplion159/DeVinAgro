package com.viceri.viceri.viceri.repositorio;

import java.util.List;

import com.viceri.viceri.viceri.model.Tarefa;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository<Tarefa>  {

    List<Tarefa> findAll();
    Tarefa finById(int id);
    int add (Tarefa t);
    Tarefa update(int id,Tarefa t);
    Tarefa delete(int id);
    Tarefa save(Tarefa u);
    
}
