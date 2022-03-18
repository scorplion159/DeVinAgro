package com.DevinAgro.DevinAgrofinal.controller;

import java.util.List;

import com.DevinAgro.DevinAgrofinal.model.Funcionario;
import com.DevinAgro.DevinAgrofinal.service.FuncionaroService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/funcionario")
public class FuncionarioController {

     private FuncionaroService funS;

    

    public FuncionarioController(FuncionaroService funS) {
        this.funS = funS;
    }

    @GetMapping////Lista todos os funcionarios
    public List<Funcionario> listaFazenda(){
        return funS.listaFuncionario();
    }

    @PostMapping///CADASTRA FUNCIONARIOS
    public Funcionario cadastraFazenda(@RequestBody Funcionario funcionario){
       return funS.cadastraFuncionario(funcionario);
    }
    @GetMapping("/{id}")////LISTA FUNCIONARIOS por empresa(pelo id)
    public List<Funcionario> listaFuncionariosDeEmpresa(@PathVariable Long id){
        return funS.ListaFuncionariosDaEmpresa(id);
    }
    @GetMapping("/contador/{id}")////CONTA FUNCIONARIO POR EMPRESA(PELO ID)
    public Integer ContaFuncionarioPorEmpresaId(@PathVariable Long id){
        return funS.ContaFuncionarioPorEmpresaPorId(id);

    }
    
    
}
