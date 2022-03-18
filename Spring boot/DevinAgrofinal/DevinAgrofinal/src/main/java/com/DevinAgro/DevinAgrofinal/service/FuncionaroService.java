package com.DevinAgro.DevinAgrofinal.service;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Funcionario;
import com.DevinAgro.DevinAgrofinal.repository.FuncionarioRepository;

import org.springframework.stereotype.Service;

@Service
public class FuncionaroService {
    private FuncionarioRepository fr;

    public FuncionaroService(FuncionarioRepository fr) {
        this.fr = fr;
    }


    public List<Funcionario> listaFuncionario(){
        return  fr.findAll();
    }
    public Funcionario cadastraFuncionario(Funcionario funcionario){
       return fr.save(funcionario);

    }
    public List<Funcionario> ListaFuncionariosDaEmpresa(long id){
        return fr.findByEmpresaId(id);
    }
    public Integer ContaFuncionarioPorEmpresaPorId(Long id){
        return fr.CountByEmpresaId(id);
    }
    
}
