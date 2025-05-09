package com.sabino.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabino.curso.entities.Order;
import com.sabino.curso.entities.User;
import com.sabino.curso.repositories.OrderRepositories;


@Service
public class OrderService {
	
  @Autowired
	private OrderRepositories repository;
	
  public List<Order> findAll() {
	  return repository.findAll();
  }
  
  
  public Order findById(Long Id) {
	  Optional<Order> opitinoal = repository.findById(Id);
	  return opitinoal.get();
  }
}
