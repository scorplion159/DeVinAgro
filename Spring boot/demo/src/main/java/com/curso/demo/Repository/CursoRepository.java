package com.curso.demo.Repository;

import java.util.ArrayList;
import java.util.List;

import com.curso.demo.model.Curso;

public class CursoRepository implements CRUDRepository<Curso>{
    private final List<Curso> mapCurso = new ArrayList<Curso>();

    @Override
    public List findAll() {
        
        return mapCurso;
    }

    @Override
    public Curso finById(int id) {
        // TODO Auto-generated method stub
        return mapCurso.get(id);
    }

    @Override
    public int add(Curso curso) {
        this.mapCurso.add(curso);
        return this.mapCurso.indexOf(curso);
    }

    @Override
    public Curso update(int id, Curso curso) {
        
        return this.mapCurso.set(id, curso);
    }

    @Override
    public Curso delete(int id) {
        
        return this.mapCurso.remove(id);
    }

    @Override
    public int save(Curso t) {
        // TODO Auto-generated method stub
        return 0;
    }
    
}
