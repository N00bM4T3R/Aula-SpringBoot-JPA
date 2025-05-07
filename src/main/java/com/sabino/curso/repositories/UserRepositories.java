package com.sabino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.curso.entities.User;

public interface UserRepositories extends JpaRepository<User, Long> {
	

}
