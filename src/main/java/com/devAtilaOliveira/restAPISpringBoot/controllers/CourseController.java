package com.devAtilaOliveira.restAPISpringBoot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devAtilaOliveira.restAPISpringBoot.entities.Course;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {
	
	@GetMapping
	public ResponseEntity<Course> findAll() {
		Course c = new Course(1L, "Vue.Js", "Complete Course", 15L);
		return ResponseEntity.ok().body(c);
	}
	
}

