package com.viceri.viceri.viceri.service;

import java.util.List;

import com.viceri.viceri.viceri.model.Tarefa;

import org.springframework.stereotype.Service;
@Service
public class TarefaService implements CRUDServiceUsuario {

    @Override
    public List findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object finById(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int add(Object u) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public Object update(int id, Object u) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object delete(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Object save(Object u) {
        // TODO Auto-generated method stub
        return null;
    }

    
    public Tarefa completa(Tarefa tarefa){
        tarefa.setTarefaConcluida(true);
        return tarefa;
    }
    
}
