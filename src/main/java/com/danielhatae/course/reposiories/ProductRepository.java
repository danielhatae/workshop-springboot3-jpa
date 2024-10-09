package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>  {
	

}
