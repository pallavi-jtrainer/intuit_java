package com.springpeople.SpringCoreCrudDemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.springpeople.SpringCoreCrudDemo.config.AppConfig;
import com.springpeople.SpringCoreCrudDemo.dao.StudentDao;
import com.springpeople.SpringCoreCrudDemo.entity.Student;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
       AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
       StudentDao dao = context.getBean(StudentDao.class);
       
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter student id: ");
       int id = sc.nextInt();
       System.out.println("Enter name: ");
       String name = sc.next();
       System.out.println("Enter email: ");
       String email = sc.next();
       
       Student s = new Student(id, name, email);
       
       boolean info = dao.uploadNewStudentData(s);
       if(info) {
    	   System.out.println("Student Data Successfully Inserted");
       } else {
    	   System.out.println("Insertion unsuccessful :(");
       }
       
       List<Student> students = dao.listOfStudents();
       for(Student s1: students) {
    	   System.out.println(s1.toString());
       }
//       StudentDao dao = new StudentDaoImpl();
    }
}
