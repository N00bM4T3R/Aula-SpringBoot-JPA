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
  public User insert(User obj) {
	  return repository.save(obj);
	  
  }
  public void delete(Long id) {
	  repository.deleteById(id);
  }
  public User update(Long id, User obj) {
	  User entity = repository.getReferenceById(id);
	  updateData(entity,obj);
	  return repository.save(entity);
	  
  }


private void updateData(User entity, User obj) {
	entity.setEmail(obj.getEmail());
	entity.setName(obj.getName());
	entity.setPhone(obj.getPhone());
	
	
}
}
