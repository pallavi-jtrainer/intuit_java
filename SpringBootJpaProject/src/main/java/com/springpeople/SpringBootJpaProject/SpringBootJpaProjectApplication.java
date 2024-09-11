package com.springpeople.SpringBootJpaProject;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpeople.SpringBootJpaProject.entity.Student;
import com.springpeople.SpringBootJpaProject.service.StudentService;

@SpringBootApplication
public class SpringBootJpaProjectApplication implements CommandLineRunner{

	@Autowired
	private StudentService service;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaProjectApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Student student = new Student(5, "Reshma", "ress@ahdh");
		
		Student st = service.saveStudent(student);
		
		if(student.equals(st)) {
			System.out.println("Student added successfully");
		} else {
			System.out.println("Addition failed");
		}
		
		List<Student> students = service.listAllStudents();
		for(Student s: students) {
			System.out.println(s.toString());
		}
		
	}

}
