package com.springpeople.SpringBootJdbcDemo;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpeople.SpringBootJdbcDemo.entity.Employee;
import com.springpeople.SpringBootJdbcDemo.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootJdbcDemoApplication implements CommandLineRunner{

	@Autowired
	private EmployeeRepository repo;
	
	private void mainmenu() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1. View All Employees");
			System.out.println("2. View Employee Details");
			System.out.println("3. Add New Employee");
			System.out.println("4. Exit");
			System.out.println("Enter choice: ");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				List<Employee> employees = repo.listAll();
				for(Employee e: employees) {
					System.out.println(e.toString());
				}
				break;
			case 2:
				System.out.println("Enter employee id: ");
				int id = sc.nextInt();
				
				String str = repo.getAllDetailsForEmployee(id);
				System.out.println(str);
				break;
			case 3:
				System.out.println("Enter id: ");
				int id1 = sc.nextInt();
				System.out.println("First Name");
				String first = sc.next();
				System.out.println("Last Name");
				String last = sc.next();
				System.out.println("Email");
				String email = sc.next();
				System.out.println("Department id");
				int d = sc.nextInt();
				
				Employee e = new Employee(id1, first, last, email, d);
				int res = repo.insertEmployeeDetails(e);
				if(res > 0) {
					System.out.println("Employee Added");
				} else {
					System.out.println("Insertion failed");
				}
				break;
			case 4:
				System.out.println("Exiting");
				System.exit(0);
			default: 
				System.out.println("Wrong choice");
				break;
			}
		} while(true);
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mainmenu();
	}

}
