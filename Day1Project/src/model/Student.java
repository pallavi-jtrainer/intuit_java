package model;

//import java.util.Set;

public class Student {
	// member variables or attributes or properties
//	public int studentId;
	private int studentId;
	private String studentName;
	private int age;
	
	//behaviour
	public int getStudentId() {
		return studentId;
	}
	
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void acceptValues(int id, String name, int age) {
		this.studentId = id;
		this.studentName = name;
		this.age = age;
	}
	
	public String showStudentDetails() {
		return "Id: " + this.studentId + ", Name: " + this.studentName
				+ ", Age: " + this.age;
	}
}
