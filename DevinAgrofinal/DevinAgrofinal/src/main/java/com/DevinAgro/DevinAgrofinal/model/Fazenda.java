package com.DevinAgro.DevinAgrofinal.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Fazenda{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique=true)
    private String nome;
    private String endereco;
    @Column(nullable=false)
    private Double estoque;
    @ManyToOne
    private Empresa empresa;
    @OneToOne
    
    private Grao grao;
    private LocalDate dataProximaColheita;
    
    private LocalDate ultimaColheita;
    
    
    public LocalDate getDataProximaColheita() {
        return dataProximaColheita;
    }
    public void setDataProximaColheita(LocalDate dataProximaColheita) {
        this.dataProximaColheita = dataProximaColheita;
    }
    
    public Grao getGrao() {
        return grao;
    }
    public void setGrao(Grao grao) {
        this.grao = grao;
    }
   
    
   
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    public Double getEstoque() {
        return estoque;
    }
    public void setEstoque(Double estoque) {
        this.estoque = estoque;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public LocalDate getUltimaColheita() {
        return ultimaColheita;
    }
    public void setUltimaColheita(LocalDate ultimaColheita) {
        this.ultimaColheita = ultimaColheita;
    }
   
    public Fazenda(Long id, String nome, String endereco,  Double estoque, Empresa empresa,
            LocalDate ultimaColheita,Grao grao, LocalDate dataProximaColheita) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.grao=grao;
        this.estoque = estoque;
        this.empresa = empresa;
        this.ultimaColheita = ultimaColheita;
        this.dataProximaColheita =dataProximaColheita;
        
    }
    public Fazenda() {
    }
    public LocalDate proximaColheita(LocalDate ultimaColheita,Grao grao){
        if (ultimaColheita==null){
            setUltimaColheita(LocalDate.now());
        }
        LocalDate x = ultimaColheita.plusDays(grao.getTempoColheita());
        

        return ultimaColheita.plusDays(grao.getTempoColheita());
    } 

}