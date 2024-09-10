package com.springpeople.SpringCoreCrudDemo.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.springpeople.SpringCoreCrudDemo.entity.Student;
import com.springpeople.SpringCoreCrudDemo.entity.StudentMapper;

@Component
public class StudentDaoImpl implements StudentDao{

	private JdbcTemplate jdbcTemplate;
	
	private final String SQL_GET_ALL = "select * from student";
	private final String SQL_GET_ONE = "select * from student where studentId = ?";
	private final String SQL_INSERT_STUDENT = "insert into student (studentid, studentname, email)" 
			+ " values (?, ?, ?)";
	
	@Autowired
	public StudentDaoImpl(DataSource datasource) {
		this.jdbcTemplate = new JdbcTemplate(datasource);
	}
	
	@Override
	public List<Student> listOfStudents() {
		return jdbcTemplate.query(SQL_GET_ALL, new StudentMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Student getStudentById(int id) {
		return jdbcTemplate.queryForObject(SQL_GET_ONE, new Object[] {id},  new StudentMapper());
	}

	@Override
	public boolean uploadNewStudentData(Student student) {
		return jdbcTemplate.update(SQL_INSERT_STUDENT, student.getStudentId(), student.getStudentName(), 
				student.getEmail()) > 0;
	}

}
