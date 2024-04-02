package com.generation.lojagames.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.generation.lojagames.model.Produto;


public interface Produtorepository extends JpaRepository<Produto, Long> {
    List<Produto> findByNomeContainingIgnoreCase(String nome);
    List<Produto> findByCategoria(String categoria);
    List<Produto> findByPrecoGreaterThan(double preco);
   
    void saveAll(List<Produto> produtos);
    void deleteByNome(String nome);
    long countByCategoria(String categoria);
    boolean existsByNome(String nome);
}