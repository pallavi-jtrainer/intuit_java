package com.springpeople.SpringBootDataJpaDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeople.SpringBootDataJpaDemo.entity.Department;
import com.springpeople.SpringBootDataJpaDemo.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository repo;
	
	public List<Department> listAll() {
		return repo.findAll();
	}
	
	public Department getDepartmentById(int id) {
		return repo.findByDeptId(id);
	}
	
	public Department getDepartmentByName(String name) {
		return repo.findByDeptName(name);
	}
}
