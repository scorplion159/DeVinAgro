package com.viceri.viceri.viceri.controle;

import java.util.List;
import java.util.Optional;

import javax.naming.directory.NoSuchAttributeException;

import com.viceri.viceri.viceri.model.Tarefa;
import com.viceri.viceri.viceri.model.Usuario;
import com.viceri.viceri.viceri.repositorio.TarefaRepository;
import com.viceri.viceri.viceri.repositorio.UsuarioRepositorio;
import com.viceri.viceri.viceri.service.TarefaService;
import com.viceri.viceri.viceri.service.UsuarioService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class TarefaControle {
   
    private TarefaService tarefaService;

    public TarefaControle(TarefaService tarefaService) {
        this.tarefaService = tarefaService;
    }

    @GetMapping
    public List<Tarefa> getCurso(){
        return tarefaService.findAll();
        
    }

    @PostMapping
    public Object postCurso(@RequestBody Tarefa tarefa){
        return tarefaService.save(tarefa);
        
    }
    


    @PutMapping("/{id}")
    public Object putCurso(@PathVariable int id, @RequestBody Tarefa tarefa){
        return tarefaService.update(id, tarefa);
        
    }

    @DeleteMapping("/{id}")
    public Object deleteCurso(@PathVariable int id){
        return tarefaService.delete(id);

    }

    @PutMapping("/{sid}")
    public Tarefa completa(Tarefa tarefa){
        
        return tarefaService.completa(tarefa);//MELHORAR O MÉTODO
    }

    
}