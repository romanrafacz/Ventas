package com.ventas.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.domain.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	

}
