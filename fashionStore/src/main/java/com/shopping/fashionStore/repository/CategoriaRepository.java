package com.shopping.fashionStore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.fashionStore.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
