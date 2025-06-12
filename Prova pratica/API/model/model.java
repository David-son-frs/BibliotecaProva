package com.example.Prova.model;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor


public class model {
    @Id
    private Long id;
     
    @Autowired
    private String nome;

    @Autowired
    private String email;

    @Autowired
    private String idlivro;

    @Autowired
    private String titulo;

    @Autowired
    private String autor;

    @Autowired
    private String genero;

    @Autowired
    private String datacadastro;

}