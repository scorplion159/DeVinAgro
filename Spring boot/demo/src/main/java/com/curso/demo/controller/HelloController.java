package com.curso.demo.controller;

import javax.websocket.server.PathParam;

import com.curso.demo.model.Saudacao;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @GetMapping("/{nome}")
    public Saudacao hello(@PathVariable String nome){
        return new Saudacao("hello"+ nome);
    }
    

    
}
