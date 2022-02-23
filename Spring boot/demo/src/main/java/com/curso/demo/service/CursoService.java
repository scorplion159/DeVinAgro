package com.curso.demo.service;

import java.util.List;

import com.curso.demo.Repository.CursoRepository;
import com.curso.demo.model.Curso;

import org.springframework.stereotype.Service;
@Service
public class CursoService implements CRUDService<Curso> {

    //private CursoRepository cursoRepository;
    CursoRepository cursoRepository2 = new CursoRepository();
    
    

    @Override
    public List<Curso> findAll() {
        
        // TODO Auto-generated method stub
        return cursoRepository2.findAll();
    }

    @Override
    public Curso finById(int id) {
        
        return cursoRepository2.finById(id);
    }

    @Override
    public int add(Curso t) {
        // TODO Auto-generated method stub
        return cursoRepository2.add(t);
    }

    @Override
    public Curso update(int id, Curso t) {
        // TODO Auto-generated method stub
        return cursoRepository2.update(id, t);
    }

    @Override
    public Curso delete(int id) {
        // TODO Auto-generated method stub
        return cursoRepository2.delete(id);
    }

    @Override
    public int save(Curso t) {
        // TODO Auto-generated method stub
        return cursoRepository2.add(t);
    }

    


   
    
}
