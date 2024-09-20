package com.springpeople.SpringBootDeadlockDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeadlockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeadlockDemoApplication.class, args);
		
		final String resource1 = "Resource 1";
		final String resource2 = "Resource 2";
		
		Thread t1 = new Thread() {
			public void run() {
				synchronized(resource1) {
					System.out.println("Thread 1 locked resource1");
				}
				
				try {
					Thread.sleep(10000);
				} catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
				synchronized (resource2) {
					System.out.println("Thread 1 locked resource2");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 2 locked resource2");
				}
				
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					System.out.println(e.getMessage());
				}
				
				synchronized (resource1) {
					System.out.println("Thread 2 locked resource1");
				}
			}
		};
		
		t1.start();
		t2.start();
	}

}
