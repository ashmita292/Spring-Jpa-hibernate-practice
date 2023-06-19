package com.ashmita.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.ashmita.springboot.learnjpaandhibernate.course.Course;
import com.ashmita.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.ashmita.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {
	
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;

	@Override
	public void run(String... args) throws Exception {
//		repository.insert(new Course(1, "Learn AWS Jpa" , "Jack"));
//		repository.insert(new Course(2, "Learn Azure Now" , "John"));
//		repository.insert(new Course(3, "Learn Devops Now" , "Elan"));
//		
//		repository.deleteById(3);
//		
//		System.out.println(repository.selectById(1));
//		System.out.println(repository.selectById(2));
		
		repository.save(new Course(1, "Learn AWS Jpa" , "Jack"));
		repository.save(new Course(2, "Learn Azure Now" , "John"));
		repository.save(new Course(3, "Learn Devops Now" , "Elan"));
		
		repository.deleteById(3);
		
		System.out.println(repository.findById(1));
		System.out.println(repository.findById(2));
		
		System.out.println(repository.findAll());
		
		System.out.println(repository.findByAuthor("John"));
		System.out.println(repository.findByName("Learn AWS Jpa"));
	}

}
