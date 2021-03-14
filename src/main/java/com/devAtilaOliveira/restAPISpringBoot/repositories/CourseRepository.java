package com.devAtilaOliveira.restAPISpringBoot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devAtilaOliveira.restAPISpringBoot.entities.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{
	
}
