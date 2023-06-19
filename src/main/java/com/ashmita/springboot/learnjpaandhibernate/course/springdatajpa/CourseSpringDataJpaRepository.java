package com.ashmita.springboot.learnjpaandhibernate.course.springdatajpa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ashmita.springboot.learnjpaandhibernate.course.Course;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Integer> {
	List<Course> findByAuthor(String author);
	List<Course> findByName(String name);
}
