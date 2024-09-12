package com.springpeople.SpringBootDataJpaDemo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
//import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employee")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Employee {
	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email")
	private String email;
	
	@Column(name="dept_id")
	private int deptId;
	
	@Override
	public String toString() {
		return "Employee -> Id: " + empId + ", First Name: "
				+ firstName + ", Last Name: " + lastName
				+ ", Email: " + email + ", Department Id: " + deptId;
	}
}
