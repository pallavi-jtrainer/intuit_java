package com.springpeople.SpringBootJdbcDemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootJdbcDemo.entity.Department;

@Repository
public class DepartmentRepository {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public List<Department> listAllDepartments() {
		return jdbc.query("select * from department", new DepartmentMapper());
	}
	
	public Department getDepartmentDetails(int id) {
		return jdbc.queryForObject("select * from department where dept_id = " + id, 
				new DepartmentMapper());
	}
}
