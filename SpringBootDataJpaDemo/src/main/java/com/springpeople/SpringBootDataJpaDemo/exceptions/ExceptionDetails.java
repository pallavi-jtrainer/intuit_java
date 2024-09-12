package com.springpeople.SpringBootDataJpaDemo.exceptions;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ExceptionDetails {
	private LocalDateTime timeStamp;
	private String message;
	private String details;
}
