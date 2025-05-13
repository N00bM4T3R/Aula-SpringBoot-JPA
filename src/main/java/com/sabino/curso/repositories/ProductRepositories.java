package com.sabino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.curso.entities.Product;

public interface ProductRepositories extends JpaRepository<Product, Long> {
	

}
