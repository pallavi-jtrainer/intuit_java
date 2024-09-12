package com.springpeople.SpringBootDataJpaDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeople.SpringBootDataJpaDemo.entity.Employee;
import com.springpeople.SpringBootDataJpaDemo.exceptions.ResourceNotFoundException;
import com.springpeople.SpringBootDataJpaDemo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository eRepo;
	
	public List<Employee> listAll() {
		return eRepo.findAll();
	}
	
	public Employee getEmployeeDetailsbyId(int id) throws ResourceNotFoundException {
		Employee e = eRepo.findByEmpId(id);
		
		if(e == null) {
			throw new ResourceNotFoundException("Employee with id: " + id + " not found");
		}
		
		return e;
	}
	
	public Employee getEmployeeDetailsByEmail(String email) {
		return eRepo.findByEmail(email);
	}
	
	public Employee createNewEmployee(Employee e) {
		int id = 1;
		Employee emp = eRepo.findTopByOrderByEmpIdDesc();
		if(emp != null) {
			id = emp.getEmpId() + 1;
			
		} 
		e.setEmpId(id);
		return eRepo.save(e);
	}
	
	public List<Employee> getAllEmployeesByDept(int id) {
		return eRepo.findAllByDeptId(id);
	}
	
//	public int updateEmployee(int id, int dept) {
//		
//		
//		return eRepo.updateDeptId(id, dept);
//	}
	
	public String updateEmployee(int id, int dept) {
		String str = "Unable to update employee";
		
		int res = eRepo.updateDeptId(id, dept);
		if(res > 0) {
			str = "Employee updated";
		}
		
		return str;
	}
}
