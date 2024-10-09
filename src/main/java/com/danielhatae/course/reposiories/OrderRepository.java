package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>  {
	

}
