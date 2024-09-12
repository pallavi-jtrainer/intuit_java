package com.springpeople.SpringBootDataJpaDemo.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ExceptionDetails> resourceNotFoundExceptionHandler(ResourceNotFoundException ex, 
			WebRequest req) {
		ExceptionDetails details = new ExceptionDetails(LocalDateTime.now(), ex.getMessage(), 
				req.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<?> generalExceptionHandler(Exception ex, WebRequest req) {
		ExceptionDetails details = new ExceptionDetails(LocalDateTime.now(), ex.getMessage(), 
				req.getDescription(false));
		return new ResponseEntity<ExceptionDetails>(details, HttpStatus.INTERNAL_SERVER_ERROR);
	}
}
