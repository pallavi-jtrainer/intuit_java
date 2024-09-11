package com.springpeople.SpringBootJdbcDemo.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employee {
	private int emp_id;
	private String first_name;
	private String last_name;
	private String email;
	private int dept_id;
}
