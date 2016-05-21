package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.domain.AuthorDetails;

public interface AuthorDetailsRepository extends JpaRepository<AuthorDetails, Integer> {

}
