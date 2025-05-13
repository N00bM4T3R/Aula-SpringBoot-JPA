package com.sabino.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabino.curso.entities.Product;
import com.sabino.curso.entities.User;
import com.sabino.curso.repositories.ProductRepositories;


@Service
public class ProductService {
	
  @Autowired
	private ProductRepositories repository;
	
  
  public List<Product> findAll() {
	  return repository.findAll();
  }
  
  
  public Product findById(Long Id) {
	  Optional<Product> opitinoal = repository.findById(Id);
	  return opitinoal.get();
  }
}
