package com.sabino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.curso.entities.Order;

public interface OrderRepositories extends JpaRepository<Order, Long> {
	

}
