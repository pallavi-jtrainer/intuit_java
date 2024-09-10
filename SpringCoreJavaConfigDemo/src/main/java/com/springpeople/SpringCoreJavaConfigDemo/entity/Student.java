package com.springpeople.SpringCoreJavaConfigDemo.entity;

public class Student {
	private int studentId;
	private String name;
	private String email;
	private Courses course;
	
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public Courses getCourse() {
		return course;
	}
	
	public void setCourse(Courses course) {
		this.course = course;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + 
				", email=" + email + ", course= " + course.toString()+"]";
	}
	
	public Student() {}

	public Student(int studentId, String name, String email, Courses course) {
		this.studentId = studentId;
		this.name = name;
		this.email = email;
		this.course = course;
	}
}
