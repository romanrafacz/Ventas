package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.domain.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
