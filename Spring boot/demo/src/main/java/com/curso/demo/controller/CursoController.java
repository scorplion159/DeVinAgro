package com.curso.demo.controller;

import java.util.List;

import com.curso.demo.model.Curso;
import com.curso.demo.service.CursoService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/curso")
public class CursoController {

    private CursoService cursoService;

    public CursoController(CursoService cursoService) {
        this.cursoService = cursoService;
    }

    @GetMapping
    public List<Curso> getCurso(){
        return cursoService.findAll();
        
    }

    @PostMapping
    public int postCurso(@RequestBody Curso curso){
        return cursoService.save(curso);
        
    }
    


    @PutMapping("/{id}")
    public Curso putCurso(@PathVariable int id, @RequestBody Curso t){
        return cursoService.update(id, t);
        
    }

    @DeleteMapping
    public Curso deleteCurso(@PathVariable int id){
        return cursoService.delete(id);

    }
    
}
