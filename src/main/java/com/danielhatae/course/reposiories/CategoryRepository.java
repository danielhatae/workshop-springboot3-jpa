package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>  {
	

}
