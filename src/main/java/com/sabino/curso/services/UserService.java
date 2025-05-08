package com.sabino.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sabino.curso.entities.User;
import com.sabino.curso.repositories.UserRepositories;


@Service
public class UserService {
	
  @Autowired
	private UserRepositories repository;
	
  public List<User> findAll() {
	  return repository.findAll();
  }
  
  
  public User findById(Long Id) {
	  Optional<User> opitinoal = repository.findById(Id);
	  return opitinoal.get();
  }
}
