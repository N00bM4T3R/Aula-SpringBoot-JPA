package com.sabino.curso.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.sabino.curso.entities.User;
import com.sabino.curso.repositories.CategoryRepositories;
import com.sabino.curso.repositories.UserRepositories;
import com.sabino.curso.services.exceptions.DatabaseException;
import com.sabino.curso.services.exceptions.ResourceNotFoundException;


@Service
public class UserService {

    private final CategoryRepositories categoryRepositories;
	
  @Autowired
	private UserRepositories repository;


    UserService(CategoryRepositories categoryRepositories) {
        this.categoryRepositories = categoryRepositories;
    }
	
  
  public List<User> findAll() {
	  return repository.findAll();
  }
  
  
  public User findById(Long Id) {
	  Optional<User> opitinoal = repository.findById(Id);
	  return opitinoal.orElseThrow(() -> new ResourceNotFoundException(Id));
  }
  public User insert(User obj) {
	  return repository.save(obj);
	  
  }
  public void delete(Long id) {
	  try {
		  repository.deleteById(id);
           }  
	  catch (EmptyResultDataAccessException e) {
	  throw new ResourceNotFoundException(id);
}
	  catch (DataIntegrityViolationException e) {
		throw new DatabaseException(e.getMessage());
		
	}
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
