package com.springpeople.SpringBootDataJpaDemo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception{
	private static final long serialVersionUID = 5251441108802396507L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
}
