package com.example.Prova.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Prova.model.model;
import com.example.Prova.service.service;

@RestController
@RequestMapping("/biblioteca")
public class bibliotecaController {

    @Autowired
    private service service;

    @GetMapping
    public List<model> listar() {
        return service.listar();
    }

    @PostMapping
    public model salvar(@RequestBody model BibliotecarioRepository) {
        return service.salvar(BibliotecarioRepository);
    }

    @GetMapping("/{id}")
    public model buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}