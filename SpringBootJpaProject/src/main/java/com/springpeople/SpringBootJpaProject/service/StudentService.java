package com.springpeople.SpringBootJpaProject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springpeople.SpringBootJpaProject.entity.Student;
import com.springpeople.SpringBootJpaProject.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repo;
	
	public List<Student> listAllStudents() {
		return repo.findAll();
	}
	
	public Student saveStudent(Student s) {
		return repo.save(s);
	}
	
	public Student getStudentDetails(int id) {
		return repo.findByStudentId(id);
	}
	
	public Student getStudentDetailsByEmail(String email) {
		return repo.findByEmail(email);
	}
}
