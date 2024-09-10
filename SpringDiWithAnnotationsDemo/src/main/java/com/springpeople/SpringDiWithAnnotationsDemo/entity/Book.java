package com.springpeople.SpringDiWithAnnotationsDemo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Book {

	private int id;
	private String title;
	
	@Autowired
	private Author author;
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}
	
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
		return "Id: " + id + ", Title: " + title + ", Author: " + author.getName();
	}
	
	public Book() {
		id = 1;
		title = "Spring In Action";
	}
}
