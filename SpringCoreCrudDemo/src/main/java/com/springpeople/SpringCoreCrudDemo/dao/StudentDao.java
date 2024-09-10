package com.springpeople.SpringCoreCrudDemo.dao;

import java.util.List;

import com.springpeople.SpringCoreCrudDemo.entity.Student;

public interface StudentDao {
	public List<Student> listOfStudents();
	public Student getStudentById(int id);
	public boolean uploadNewStudentData(Student student);
}
