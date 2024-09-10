package com.springpeople.SpringDiWithAnnotationsDemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Author {
	private String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Author() {
		name = "Author 1";
	}
	
}
