package com.DevinAgro.DevinAgrofinal.service;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import com.DevinAgro.DevinAgrofinal.model.Fazenda;
import com.DevinAgro.DevinAgrofinal.model.Grao;
import com.DevinAgro.DevinAgrofinal.repository.FazendaRepository;

import org.hibernate.cfg.FkSecondPass;
import org.springframework.stereotype.Service;

@Service
public class FazendaService {

    
    private FazendaRepository fr;

    public FazendaService(FazendaRepository fs) {
        this.fr = fs;
    }
    
    public List<Fazenda> listaFazenda(){
        return  fr.findAll();
    }
    
    public Fazenda cadastraFazenda(Fazenda fazenda){
       return fr.save(fazenda);
    }
    
    public List<Fazenda> FazendaPorEmpresaId(Long id){
        return fr.findByEmpresaId(id);
    }
    
    public Integer ContaFazendaPorEmpresaPorId(Long id){
        return fr.CountByEmpresaId(id);
    }
    
    
    
    public Fazenda adicionaColheita(Long id, Double quantidadeDaColheita){
        
        Fazenda f = fr.getById(id);
        f.setEstoque(f.getEstoque()+quantidadeDaColheita);
        f.setUltimaColheita(LocalDate.now());
        f.setDataProximaColheita(f.getUltimaColheita().plusDays(f.getGrao().getTempoColheita()));
        return fr.save(f);
    }
    
    public void deleteById(Long id){
         fr.deleteById(id);
    }
    
    public Fazenda retiradaDeGrao(Long id, Double quantidadeDeRetirada){
        Fazenda f = fr.getById(id);
        f.setEstoque(f.getEstoque()-quantidadeDeRetirada);
        return fr.save(f);
    }
   

    public List FazendasPorEmpresaFilter(Long id){
        return fr.listaFazendaFilterPorEmpresa(id);
    }


    
    

    
    
    
}
