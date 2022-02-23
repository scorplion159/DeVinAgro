package com.magazinesenai.magas.model.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.magazinesenai.magas.model.Produto;

public class CadastraProduto {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("CURSO modulo 2");
        produto.setDescricao("angular");
        produto.setPreco(200.0);
        produto.setQtdEstoque(1);


        EntityManagerFactory factory = Persistence.createEntityManagerFactory("magas");
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        em.persist(produto);
        em.getTransaction().commit();
        
        

    }
    
}
