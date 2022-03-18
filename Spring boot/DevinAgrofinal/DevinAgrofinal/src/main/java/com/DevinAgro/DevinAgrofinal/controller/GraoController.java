package com.DevinAgro.DevinAgrofinal.controller;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Id;

import com.DevinAgro.DevinAgrofinal.model.Empresa;
import com.DevinAgro.DevinAgrofinal.model.Grao;
import com.DevinAgro.DevinAgrofinal.service.GraoService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/grao")
public class GraoController {
    
    private GraoService gs;

    public GraoController(GraoService gs) {
        this.gs = gs;
    }

    @GetMapping////Lista todos os grãos
    public List<Grao> listaEmpresas(){
        return gs.listaGrao();
    }
    @PostMapping////CADASTRA GRÃO
    public Grao cadastrEmpresa(@RequestBody Grao grao){
        return gs.cadastraGrao(grao);
            
    }
    @GetMapping("/empresa/{id}")//Lista de grão por empresa
    public List<Grao> graoPorEmpresa(@PathVariable Long id){
        return gs.graoPorEmpresa(id);
    }
   
    @GetMapping("/empresafilter/{id}")
    public ResponseEntity<List> graoPorFazenda(@PathVariable Long id){
        List listaFilter = gs.graoFilterPorEmpresa(id);
         return ResponseEntity.ok().body(listaFilter);
    }//LISTA DE GRAO POR EMPRESA COM SOMENTE 2 COLUNAS, NOME DO GRAO E QUANTIDADE DO MENOR PRO MAIOR ODENADO DO MENOR PARA O MAIOR 
    
    
}
