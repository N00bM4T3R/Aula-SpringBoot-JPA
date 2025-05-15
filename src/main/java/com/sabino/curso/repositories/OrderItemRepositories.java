package com.sabino.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sabino.curso.entities.OrderItem;
import com.sabino.curso.entities.pk.OrderItemPk;

public interface OrderItemRepositories extends JpaRepository<OrderItem, OrderItemPk> {
	

}
