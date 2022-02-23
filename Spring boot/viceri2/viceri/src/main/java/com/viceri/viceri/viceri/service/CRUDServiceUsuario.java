package com.viceri.viceri.viceri.service;

import java.util.List;

public interface CRUDServiceUsuario<Usuario> {

    List<Usuario> findAll();
    Usuario finById(int id);
    int add (Usuario u);
    Usuario update(int id,Usuario u);
    Usuario delete(int id);
    Usuario save(Usuario u);
    
}
