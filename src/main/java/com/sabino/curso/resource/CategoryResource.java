package com.sabino.curso.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sabino.curso.entities.Category;
import com.sabino.curso.entities.User;
import com.sabino.curso.services.CategoryService;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService cService;
	
	@GetMapping
	public  ResponseEntity<List<Category>>  findAll(){
		List<Category> list = (List<Category>) cService.findAll();
		return ResponseEntity.ok().body(list);
		
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) {
		Category obj = (Category) cService.findById(id);
		return ResponseEntity.ok().body(obj);
	}

}
