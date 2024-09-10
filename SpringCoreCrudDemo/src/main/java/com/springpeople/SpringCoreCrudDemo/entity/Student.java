package com.springpeople.SpringCoreCrudDemo.entity;

import org.springframework.stereotype.Component;

//@Component
public class Student {

	private int studentId;
	private String studentName;
	private String email;
	
	public int getStudentId() {
		return studentId;
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", email=" + email + "]";
	}
	
	public Student() {
		
	}

	public Student(int studentId, String studentName, String email) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.email = email;
	}
}
