package com.example.Prova.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Prova.model.model;
import com.example.Prova.repository.Repository;

@Service
public class service {

    @Autowired
    private Repository BibliotecarioRepository;

    public List<model> listar() {
        return BibliotecarioRepository.findAll();
    }

    public model salvar(model model) {
        return BibliotecarioRepository.save(model);
    }

    public model buscar(Long id) {
        return BibliotecarioRepository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        BibliotecarioRepository.deleteById(id);
    }
}