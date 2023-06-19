package com.ashmita.springboot.learnjpaandhibernate.course.jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class CourseJdbcRepository {
	private JdbcTemplate springJdbcTemplate;
	private static String INSERT_QUERY = 
			"""
				insert into course(id, name, author)
				values(1,"Learn AWS" ,"Ashmita");
			""";
	
	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}
}
