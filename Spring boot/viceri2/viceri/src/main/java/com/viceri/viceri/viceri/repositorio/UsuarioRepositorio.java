package com.viceri.viceri.viceri.repositorio;

import java.util.List;

import com.viceri.viceri.viceri.model.Usuario;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<Usuario,Long> {
    List<Usuario> findAll();
    Usuario finById(int id);
    int add (Usuario u);
    Usuario update(int id,Usuario u);
    Usuario delete(int id);
    Usuario save(Usuario u);
    
}
