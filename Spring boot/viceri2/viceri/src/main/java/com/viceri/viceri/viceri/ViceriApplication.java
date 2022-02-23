package com.viceri.viceri.viceri;

import com.viceri.viceri.viceri.model.EnumPrioridade;
import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;
import com.viceri.viceri.viceri.repositorio.TarefaRepository;
import com.viceri.viceri.viceri.repositorio.UsuarioRepositorio;
import com.viceri.viceri.viceri.repositorio.UsuariorpeositorioClass;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ViceriApplication {

	public static void main(String[] args) {
		SpringApplication.run(ViceriApplication.class, args);
		
		
		Usuario u = new Usuario(1L,"joao",null);
		Tarefa t = new Tarefa(1L,"ler o livro",false,EnumPrioridade.BAIXA);

		UsuariorpeositorioClass urc =new UsuariorpeositorioClass();
		u.getListaTarefa().add(t);
		urc.save(u);
		

		
		
	}

	public ViceriApplication() {
	}

	

}
