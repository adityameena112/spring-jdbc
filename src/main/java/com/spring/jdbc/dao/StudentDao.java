package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;

public interface StudentDao {
	
	int insert(Student student);
	int change(Student student);
	int delete(int studentId);
	public Student getStudent(int studentId);
	
}
