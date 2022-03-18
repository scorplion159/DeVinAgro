package com.DevinAgro.DevinAgrofinal.repository;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Funcionario;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;
@Repository
public interface FuncionarioRepository extends JpaRepository<Funcionario,Long>{
    @Query(value = "SELECT * FROM funcionario WHERE empresa_id = ?1", nativeQuery = true)
    List<Funcionario> findByEmpresaId(Long id);

    @Query(value = "SELECT COUNT (*) FROM funcionario WHERE empresa_id = ?1", nativeQuery = true)
    Integer CountByEmpresaId(Long id);


    

}