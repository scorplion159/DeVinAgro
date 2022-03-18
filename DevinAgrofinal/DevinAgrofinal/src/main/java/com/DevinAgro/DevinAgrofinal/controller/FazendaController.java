package com.DevinAgro.DevinAgrofinal.controller;

import java.util.List;


import com.DevinAgro.DevinAgrofinal.model.Fazenda;
import com.DevinAgro.DevinAgrofinal.model.Grao;
import com.DevinAgro.DevinAgrofinal.service.FazendaService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fazenda")
public class FazendaController {
    private FazendaService fs;

    public FazendaController(FazendaService fs) {
        this.fs = fs;
    }

    @GetMapping///LISTA TODAS AS FAZENDAS
    public List<Fazenda> listaFazenda(){
        return fs.listaFazenda();
    }

    @PostMapping/// CADASTRA FAZENDA
    public Fazenda cadastraFazenda(@RequestBody Fazenda fazenda){
       return fs.cadastraFazenda(fazenda);
    }
    
    @GetMapping("/{id}")//// LISTA FAZENDAS PERTENCENTES A UMA EMPRESA POR ID DA EMPRESA
    public List<Fazenda> listaFazendaPorEmpresaId(@PathVariable Long id){
        return fs.FazendaPorEmpresaId(id);

    }
    @GetMapping("/contador/{id}")/// CONTA QUANTAS FAZENDAS ESTÃO CADASTRADAS por empresa
    public Integer ContaFazendaPorEmpresaId(@PathVariable Long id){
        return fs.ContaFazendaPorEmpresaPorId(id);

    }
    @PutMapping("colheita/{id}/{colheita}")//ADICIONA GRAOS AO ESTOQUE DA FAZENDA E ATUALIZA DATA DA ULTIMA COLHEITA DO GRÃO NA FAZENDA
    public Fazenda adicionaColheita(@PathVariable Long id,@PathVariable Double colheita){
       return fs.adicionaColheita(id, colheita);
    }
    @DeleteMapping("/{id}")//DELETA FAZENDA POR ID
    public void delete(@PathVariable Long id){
       fs.deleteById(id);
    }
    @PutMapping("retirada/{id}/{retirada}")//RETIRA GRAOS DO ESTOQUE
    public Fazenda retiradaDeGrao(@PathVariable Long id,@PathVariable Double retirada){
       return fs.retiradaDeGrao(id, retirada);
    }
   
    @GetMapping("/fazendaporempresafiltercomdata/{id}")//LISTA FAZENDA DE UMA EMPRESA COM SOMENTE 3 COLUNAS, ID, NOME FAZENDA, DATA PROXIMA COLHEITA
    List<Fazenda> fazendaPorEmpresa(@PathVariable Long id){
        return fs.FazendaPorEmpresaId(id);
    }
    @GetMapping("/fazendaempresafilter/{id}")//LISTA FAZENDA POR EMPRESA C/SOMENTE ID, NOME DA FAZENDA,DATA DA PROXIMA COLHEITA
    public ResponseEntity<List>listaFazendaFilter(@PathVariable Long id){
        List listaFilter = fs.FazendasPorEmpresaFilter(id);
        return ResponseEntity.ok().body(listaFilter);
    }

    

    
}
