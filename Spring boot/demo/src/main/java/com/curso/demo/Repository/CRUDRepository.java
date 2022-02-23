package com.curso.demo.Repository;

import java.util.List;


    public interface CRUDRepository<T> {
        List<T> findAll();
        T finById(int id);
        int add (T t);
        T update(int id,T t);
        T delete(int id);
        int save(T t);
    
    }

    

