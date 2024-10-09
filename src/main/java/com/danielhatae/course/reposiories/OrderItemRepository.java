package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.OrderItem;
import com.danielhatae.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>  {
	
}
