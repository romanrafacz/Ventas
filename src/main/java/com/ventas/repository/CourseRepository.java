package com.ventas.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ventas.domain.Course;

public interface CourseRepository extends JpaRepository<Course, Integer> {

}
