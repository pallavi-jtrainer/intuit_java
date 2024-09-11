package com.springpeople.SpringBootJdbcProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpeople.SpringBootJdbcProject.entity.Student;
import com.springpeople.SpringBootJdbcProject.repository.StudentRepository;

@SpringBootApplication
public class SpringBootJdbcProjectApplication implements CommandLineRunner{

	@Autowired
	private StudentRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student s = repo.getStudentDetails(3);
		System.out.println(s.toString());
			
//		int res = repo.insertStudent(new Student(4, "Student4", "sjsjs@ajja"));
//		if(res > 0) {
//			System.out.println("New Student Added");
//		} else {
//			System.out.println("Unable to add student details");
//		}
//		
//		System.out.println(repo.listAll());
	}

	
}
