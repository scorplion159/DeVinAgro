package com.DevinAgro.DevinAgrofinal.repository;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Empresa;
import com.DevinAgro.DevinAgrofinal.model.Fazenda;
import com.DevinAgro.DevinAgrofinal.model.Grao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
@Repository
public interface FazendaRepository extends JpaRepository<Fazenda,Long>{
    @Query(value = "SELECT * FROM fazenda WHERE empresa_id = ?1", nativeQuery = true)
    List<Fazenda> findByEmpresaId(Long id);

    @Query(value = "SELECT COUNT (*) FROM fazenda WHERE empresa_id = ?1", nativeQuery = true)
    Integer CountByEmpresaId(Long id);

   
    @Query(value="select id, nome,data_proxima_colheita from fazenda WHERE fazenda.empresa_id = ?1",nativeQuery = true)
    List listaFazendaFilterPorEmpresa(Long id);
    
    
    

    

  
    
}