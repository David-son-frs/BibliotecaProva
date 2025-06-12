package com.example.Prova.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Prova.model.model;

public interface Repository extends JpaRepository<model, Long> {
}