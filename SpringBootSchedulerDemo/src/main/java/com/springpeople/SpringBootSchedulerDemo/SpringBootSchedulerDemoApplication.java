package com.springpeople.SpringBootSchedulerDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringBootSchedulerDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSchedulerDemoApplication.class, args);
	}

}
