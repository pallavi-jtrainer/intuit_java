package com.springpeople.SpringBootJdbcDemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJdbcDemoApplication implements CommandLineRunner{

	private void mainmenu() {
		
	}
	public static void main(String[] args) {
		SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		mainmenu();
	}

}
