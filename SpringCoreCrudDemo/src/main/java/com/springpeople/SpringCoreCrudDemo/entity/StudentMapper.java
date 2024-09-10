package com.springpeople.SpringCoreCrudDemo.entity;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student s = new Student();
		s.setStudentId(rs.getInt("STUDENTID"));
		s.setStudentName(rs.getString("STUDENTNAME"));
		s.setEmail(rs.getString("EMAIL"));
		
		return s;
		
	}
	
}
