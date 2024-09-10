package com.springpeople.SpringDiWithAnnotationsDemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springpeople.SpringDiWithAnnotationsDemo.entity.Book;

@Component
public class BookController {

	//field level injection
//	@Autowired
	private Book book;
	
	//setter injection
//	@Autowired
	public void setBook(Book book) {
		this.book = book;
	}
	
	public Book getBook() {
		return book;
	}
	
	public BookController() {
		
	}
	
	//constructor injection
	@Autowired
	public BookController(Book book) {
		this.book = book;
	}
}
