package model;

//single line comment
/*
 * multi
 * line
 * comment
 * */

//import java.util.Set;

/**
 * Student class
 * @author Pallavi Prasad
 */
public class Student {
	// member variables or attributes or properties
//	public int studentId;
	private int studentId;
	private String studentName;
	private int age;
	
	//behaviour
	/**
	 * getter for studentId
	 * @return int - studentId
	 */
	public int getStudentId() {
		return studentId;
	}
	
	/**
	 * setter for studentId
	 * @param studentId - int
	 */
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
	
	//default constructor
	public Student() {
		
	}

	//parameterized constructor
	public Student(int studentId, String studentName, int age) {
		this.studentId = studentId;
		this.studentName = studentName;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + this.studentId 
				+ ", studentName=" + this.studentName 
				+ ", age=" + this.age + "]";
	}
	
	
	
}
