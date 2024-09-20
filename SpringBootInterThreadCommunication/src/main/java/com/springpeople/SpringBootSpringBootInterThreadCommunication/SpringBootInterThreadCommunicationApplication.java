package com.springpeople.SpringBootSpringBootInterThreadCommunication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpeople.SpringBootSpringBootInterThreadCommunication.entity.Account;

@SpringBootApplication
public class SpringBootInterThreadCommunicationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInterThreadCommunicationApplication.class, args);
		
		Account account = new Account();
		
		Thread t1 = new Thread() {
			public void run() {
				account.withdraw(150000);
			};
		};
		
		t1.start();
		
		Thread t2 = new Thread() {
			public void run() {
				account.deposit(80000);
			}
		};
		
		t2.start();
	
	}

}
