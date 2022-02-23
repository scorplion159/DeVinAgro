package com.curso.demo.service;

import java.util.List;

public interface CRUDService<T> {
    List<T> findAll();
        T finById(int id);
        int add (T t);
        T update(int id,T t);
        T delete(int id);
        int save (T t);
    
    
}
