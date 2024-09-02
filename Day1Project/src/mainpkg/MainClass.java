package mainpkg;

import java.util.Scanner;

import model.Student;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		System.out.println("Hello World!");
		
//		Student s =  new Student();
//		s.acceptValues(1, "Prithvi", 16);
//		System.out.println(s.showStudentDetails());
		
//		Student s = new Student(1, "Prithvi", 16);
//		System.out.println(s.showStudentDetails());
//		
//		Student s1= new Student();
//		s1.setStudentId(2);
//		s1.setStudentName("Pranav");
//		s1.setAge(16);
//		String str = s1.showStudentDetails();
//		System.out.println(str);
		
//		int x = 10;
//		if(x > 1) {
//			System.out.println("x: " + x);
//		} else {
//			
//		}
		
//		String str = (x > 1) ? "x: " + x : "Some content"; 
		
//		System.out.println("Initial value of x :" + x);
//		++x;
//		
//		System.out.println("Pre - increment: x: " + x);
		
//		x++;
//		System.out.println("Post - increment: x: " + x);
		
//		for(int i = 0; i < 5; i++) {
//			System.out.println(i);
//		}
		
		//entry controlled loop
//		while(x > 10) {
//			System.out.println(x);
//			x++;
//		}
		
	//exit controlled loop
//		do {
//			System.out.println(x);
//			x++;
//		}while(x < 10);
//		
		
//		int arr[] = new int[5];
////		arr[0] = 10;
////		arr[1] = 23;
//		
//		for(int i = 0; i < arr.length; i++) {
//			arr[i] = i + 10 * i;
//		}
//		
//		System.out.println("Array: ");
//		for(int val: arr) {
//			System.out.println(val);
//		}
//		
//		int arr1[][] = new int[2][2];
//		
//		for(int row = 0; row < arr1.length; row++) {
//			for(int col = 0; col < arr1[row].length; col++) {
//				arr1[row][col] = row + col;
//			}
//		}
//		
//		for(int row = 0; row < arr1.length; row++) {
//			for(int col = 0; col < arr1[row].length; col++) {
//				System.out.print(arr1[row][col] + " ");
//			}
//			System.out.println();
//		}
		
//		int[][] arr2 = new int[4][2];
	
		//array of objects
		Student[] students = new Student[3];
		for(int i = 0; i < 3; i++) {
			System.out.print("Enter Id: ");
			int id = sc.nextInt();
			System.out.print("Enter  Name: ");
			String name = sc.next();
			System.out.print("Enter Age: ");
			int age = sc.nextInt();
			students[i] = new Student(id, name, age);
//			students[i] = new Student(i+1, "Student"+i+1, 16);
		}
		
		for(Student s: students) {
//			System.out.println(s.getStudentId() + " " + s.getStudentName() + " " + s.getAge());
//			System.out.println(s.showStudentDetails());
			System.out.println(s.toString());
		}
		
		
	}
}
