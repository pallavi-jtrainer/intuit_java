package com.springpeople.SpringBootDataJpaDemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
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
}
