package com.springpeople.SpringBootJdbcDemo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootJdbcDemo.entity.Department;
import com.springpeople.SpringBootJdbcDemo.entity.Employee;

@Repository
public class EmployeeRepository {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Autowired
	private DepartmentRepository dRepo;
	
	public List<Employee> listAll() {
		return jdbc.query("select * from employee", new EmployeeMapper());
	}
	
	public List<Employee> listAllByDepartment(int id) {
		return jdbc.query("select * from employee where dept_id = " + id, new EmployeeMapper());
	}
//	public Employee getEmployeeDetails(int id) {
//		return jdbc.queryForObject("select * from employee where emp_id = " + id, new EmployeeMapper());
//	}
	
	public String getAllDetailsForEmployee(int id) {
		Employee e = jdbc.queryForObject("select * from employee where emp_id = " + id, new EmployeeMapper());
		Department d = dRepo.getDepartmentDetails(e.getDept_id());
		String str = e.toString() + ", Department Name = " + d.getDept_name();
		return str;
	}
	
	public int insertEmployeeDetails(Employee e) {
		return jdbc.update("insert into employee(emp_id, first_name, last_name, email, dept_id)" 
				+ " values(?, ?, ?, ?, ?)", e.getEmp_id(), e.getFirst_name(), e.getLast_name(), e.getEmail(), e.getDept_id());
	}
	
	
}
