package com.spring.jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {

	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String query = "insert into student(id,name,city) values(?,?,?)";
        
        int result = jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return result;
	}
	
	
	public int change(Student student) {
		// updating data
		String query = "update student set name=?, city=? where id=?";
		int result = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
		return result;
	}
	

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}


	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int result = jdbcTemplate.update(query, studentId);
		return result;
	}


	public Student getStudent(int studentId) {
		// select single student data
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student result = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		
		return result;
	}
	
	

}
