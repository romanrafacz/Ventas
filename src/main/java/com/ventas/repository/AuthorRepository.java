package com.ventas.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ventas.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {
	


}
