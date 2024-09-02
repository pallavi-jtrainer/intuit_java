package mainpkg;

import model.Student;

public class MainClass {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
		Student s =  new Student();
		s.acceptValues(1, "Prithvi", 16);
		System.out.println(s.showStudentDetails());
	}
}
