package com.danielhatae.course.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.danielhatae.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>  {
	

}
