package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>  {
	
}
