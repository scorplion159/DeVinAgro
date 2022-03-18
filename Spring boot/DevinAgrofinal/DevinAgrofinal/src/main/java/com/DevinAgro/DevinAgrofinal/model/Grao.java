package com.DevinAgro.DevinAgrofinal.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Grao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    ;
    @ManyToOne
    private Empresa empresa;
   
    private Long tempoColheita;
    
   
    
    
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    public Long getTempoColheita() {
        return tempoColheita;
    }
    public void setTempoColheita(Long tempoColheita) {
        this.tempoColheita = tempoColheita;
    }
    public Grao(long id, String nome, Empresa empresa,   Long tempoColheita) {
        this.id = id;
        this.nome = nome;
        this.empresa = empresa;
        
        
        this.tempoColheita = tempoColheita;
    }
    public Grao() {
    }
    
}
