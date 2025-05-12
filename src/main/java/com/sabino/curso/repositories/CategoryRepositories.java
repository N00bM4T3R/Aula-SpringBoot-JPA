package com.sabino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.curso.entities.Category;

public interface CategoryRepositories extends JpaRepository<Category, Long> {
	

}
