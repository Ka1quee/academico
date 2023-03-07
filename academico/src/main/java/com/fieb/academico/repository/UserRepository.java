package com.fieb.academico.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fieb.academico.model.User;

public interface UserRepository extends JpaRepository <User, Long>  {
	
	User findByEmail(String email);

}
