package com.springpeople.SpringBootJdbcDemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springpeople.SpringBootJdbcDemo.entity.Department;

public class DepartmentMapper implements RowMapper<Department>{
	@Override
	public Department mapRow(ResultSet rs, int rowNum) throws SQLException {
		Department d = new Department();
		d.setDept_id(rs.getInt("dept_id"));
		d.setDept_name(rs.getString("dept_name"));
 		return d;
	}
}
