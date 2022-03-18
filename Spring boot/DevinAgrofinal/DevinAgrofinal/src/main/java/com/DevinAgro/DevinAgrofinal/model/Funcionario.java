package com.DevinAgro.DevinAgrofinal.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.br.CPF;
@Entity
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String sobrenome;
    @Column(unique=true)
    @CPF//Valida o cpf com ou sem pontuação
    //@Pattern(regexp="([0-9]{3}[.][0-9]{3}[.][0-9]{3}-[0-9]{2})", message = "O Formato do cpf deve ser similar a es xxx.xxx.xxx-xx")
    private String cpf;
    private String endereco;
    @Column(unique = true)
    @Pattern(regexp = "([(][0-9]{2}[)] [0-9]{9})",message =   " Insira seu telefone no seguinte formato [99 90000-9999]")
    private String telefone;
    private EnumSexo sexo;
    private Date dataNascimento;
    private Date dataContratacao;
    @ManyToOne
    private Empresa empresa;
    
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
    public String getSobrenome() {
        return sobrenome;
    }
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public EnumSexo getSexo() {
        return sexo;
    }
    public void setSexo(EnumSexo sexo) {
        this.sexo = sexo;
    }
    public Date getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    public Date getDataContratacao() {
        return dataContratacao;
    }
    public void setDataContratacao(Date dataContratacao) {
        this.dataContratacao = dataContratacao;
    }
    public Empresa getEmpresa() {
        return empresa;
    }
    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }
    public Funcionario(Long id, String nome, String sobrenome, String cpf, String endereco, String telefone,
            EnumSexo sexo, Date dataNascimento, Date dataContratacao, Empresa empresa) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.dataContratacao = dataContratacao;
        this.empresa = empresa;
    }
    public Funcionario() {
    }
    
}
