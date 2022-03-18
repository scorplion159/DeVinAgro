package com.DevinAgro.DevinAgrofinal.controller;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Empresa;
import com.DevinAgro.DevinAgrofinal.service.EmpresaService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class EmpresaController {

    private EmpresaService es;

    public EmpresaController(EmpresaService es) {
        this.es = es;
    }
    @GetMapping///LISTA TODAS AS EMPRESAS
    public List<Empresa> listaEmpresas(){
        return es.listaEmpresas();
    }
    @PostMapping///CADASTRA UMA EMPRESA
    public Empresa cadastrEmpresa(@RequestBody Empresa empresa){
        return es.cadastraEmpresa(empresa);
            
    }
    
    
}
