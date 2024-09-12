package com.springpeople.SpringBootDataJpaDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeople.SpringBootDataJpaDemo.entity.Employee;
import com.springpeople.SpringBootDataJpaDemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository eRepo;
	
	public List<Employee> listAll() {
		return eRepo.findAll();
	}
	
	public Employee getEmployeeDetailsbyId(int id) {
		return eRepo.findByEmpId(id);
	}
	
	public Employee getEmployeeDetailsByEmail(String email) {
		return eRepo.findByEmail(email);
	}
	
	public Employee createNewEmployee(Employee e) {
		return eRepo.save(e);
	}
	
	public List<Employee> getAllEmployeesByDept(int id) {
		return eRepo.findAllByDeptId(id);
	}
	
	public int updateEmployee(int id, int dept) {
		return eRepo.updateDeptId(id, dept);
	}
}
