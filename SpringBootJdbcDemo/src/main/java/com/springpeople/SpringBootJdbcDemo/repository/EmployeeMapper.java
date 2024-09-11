package com.springpeople.SpringBootJdbcDemo.repository;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springpeople.SpringBootJdbcDemo.entity.Employee;

public class EmployeeMapper implements RowMapper<Employee>{
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp = new Employee();
		emp.setEmp_id(rs.getInt("EMP_ID"));
		emp.setFirst_name(rs.getString("first_name"));
		emp.setLast_name(rs.getString("last_name"));
		emp.setEmail(rs.getString("email"));
		emp.setDept_id(rs.getInt("dept_id"));
		return emp;
	}
}
