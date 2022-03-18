package com.DevinAgro.DevinAgrofinal.repository;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Id;

import com.DevinAgro.DevinAgrofinal.model.Empresa;
import com.DevinAgro.DevinAgrofinal.model.Grao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
@Repository
public interface GraoRepository extends JpaRepository<Grao,Long>{
   

    @Query(value ="select  grao.nome,estoque from fazenda inner join grao on fazenda.grao_id = grao.id where fazenda.empresa_id = ?1 ORDER BY estoque ASC",nativeQuery=true)
    List graoFilterByEmpresa(Long id);

    @Query(value = "SELECT * FROM grao WHERE empresa_id =?1",nativeQuery=true)
    List<Grao> graoPorEmpresa(Long id);

    
    
}