package com.springpeople.SpringBootDataJpaDemo.exceptions;

public class ResourceNotFoundException extends Exception{
	
	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
