package com.springpeople.SpringBootDataJpaDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springpeople.SpringBootDataJpaDemo.entity.Employee;
import com.springpeople.SpringBootDataJpaDemo.service.EmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService service;
	
	@GetMapping
	public ResponseEntity<List<Employee>> listAllEmployees() {
		List<Employee> employees = service.listAll();
		return new ResponseEntity<>(employees, HttpStatus.OK);
	}
	
	
	// /api/employees/1
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeDetailsById(@PathVariable int id) {
		Employee e = service.getEmployeeDetailsbyId(id);
		return new ResponseEntity<>(e, HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee e) {
		Employee emp = service.createNewEmployee(e);
		return new ResponseEntity<>(emp, HttpStatus.CREATED);
	}
	
//	@PutMapping("{id}/{dept}")
//	public ResponseEntity<String> updateEmployee(@PathVariable int id, @PathVariable int dept) {
//		int res = service.updateEmployee(id, dept);
////		String str = "Unable to update employee";
//		
//		if(res > 0) {
//			str = "Employee updated";
//		}
//		
//		return new ResponseEntity<>(str, HttpStatus.OK);
//	}
	
	@PutMapping("{id}/{dept}")
	public ResponseEntity<String> updateEmployee(@PathVariable int id, @PathVariable int dept) {
		String str = service.updateEmployee(id, dept);
		return new ResponseEntity<>(str, HttpStatus.OK);
	}
}
