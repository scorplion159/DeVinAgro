package com.DevinAgro.DevinAgrofinal.service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;

import javax.persistence.Id;

import com.DevinAgro.DevinAgrofinal.model.Grao;
import com.DevinAgro.DevinAgrofinal.repository.GraoRepository;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class GraoService {

    private GraoRepository gr;

    public GraoService(GraoRepository gr) {
        this.gr = gr;
    }


    public List<Grao> listaGrao(){
        return  gr.findAll();
    }
    public Grao cadastraGrao(Grao grao){
       return gr.save(grao);

    }
  
    public List graoFilterPorEmpresa(Long id){
        return gr.graoFilterByEmpresa(id);
    }
    public List<Grao> graoPorEmpresa(Long id){
        return gr.graoPorEmpresa(id);

    }
    
    
}
