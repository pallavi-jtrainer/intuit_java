package com.springpeople.SpringDiWithAnnotationsDemo.entity;

import org.springframework.stereotype.Component;

@Component
public class Book {

	private int id;
	private String title;
	
	public int getId() {
		return id;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	@Override
	public String toString() {
		return "Id: " + id + ", Title: " + title;
	}
}
