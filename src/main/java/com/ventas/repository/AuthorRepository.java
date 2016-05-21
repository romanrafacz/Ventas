package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Integer> {

}
