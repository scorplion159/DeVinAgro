package com.DevinAgro.DevinAgrofinal.service;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Empresa;
import com.DevinAgro.DevinAgrofinal.repository.EmpresaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpresaService {
    
    private EmpresaRepository er;

    public EmpresaService(EmpresaRepository er) {
        this.er = er;
    }
    public List<Empresa> listaEmpresas(){
        return  er.findAll();
    }
    public Empresa cadastraEmpresa(Empresa empresa){
       return er.save(empresa);

    }
        
    

    
        
    

   

    
}
