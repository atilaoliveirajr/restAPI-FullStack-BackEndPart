package com.devAtilaOliveira.restAPISpringBoot.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.devAtilaOliveira.restAPISpringBoot.entities.Course;
import com.devAtilaOliveira.restAPISpringBoot.repositories.CourseRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	@Autowired
	private CourseRepository courseRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Course c1 = new Course(null, "Vue.js", "Complete Course - Includes AJAX and WebPack", 15L);
		Course c2 = new Course(null, "Spring Boot", "Learn how to build a Rest backend application", 15L);
		Course c3 = new Course(null, "Angular", "Learn typescript with Angular", 15L);
		
		courseRepository.saveAll(Arrays.asList(c1, c2, c3));
	
	}
	
	
}
