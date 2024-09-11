package com.springpeople.SpringBootJpaProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springpeople.SpringBootJpaProject.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
	//select * from student where email = ""
	public Student findByEmail(String email);
	
	public Student findByStudentId(int id);
}
