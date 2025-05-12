package com.sabino.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabino.curso.entities.Category;
import com.sabino.curso.entities.User;
import com.sabino.curso.repositories.CategoryRepositories;


@Service
public class CategoryService {
	
  @Autowired
	private CategoryRepositories repository;
	
  
  public List<Category> findAll() {
	  return repository.findAll();
  }
  
  
  public Category findById(Long Id) {
	  Optional<Category> opitinoal = repository.findById(Id);
	  return opitinoal.get();
  }
}
