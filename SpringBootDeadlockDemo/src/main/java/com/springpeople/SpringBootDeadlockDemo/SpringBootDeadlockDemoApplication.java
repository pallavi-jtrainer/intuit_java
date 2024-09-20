package com.springpeople.SpringBootDeadlockDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDeadlockDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeadlockDemoApplication.class, args);
		
		final Resource1 resource1 = new Resource1();
		final Resource2 resource2 = new Resource2();
		
		Runnable runner1 = new Runnable() {
			
			@Override
			public void run() {
				synchronized(resource2) {
					System.out.println("Thread 1 locked resource2");
				}
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				synchronized (resource1) {
					System.out.println("In block 1");
				}
			}
		};
		
		Runnable runner2 = () -> {
			synchronized (resource2) {
				System.out.println("Thread 2 with resource 2");
				synchronized (resource1) {
					System.out.println("In block 2");
				}
			}
		};
		
		Thread t1 = new Thread(runner1);
		Thread t2 = new Thread(runner2);
		
		t1.start();
		t2.start();
		
//		final String resource1 = "Resource 1";
//		final String resource2 = "Resource 2";
//		
//		Thread t1 = new Thread() {
//			public void run() {
//				synchronized(resource1) {
//					System.out.println("Thread 1 locked resource1");
//				}
//				
//				try {
//					Thread.sleep(10000);
//				} catch(InterruptedException e) {
//					System.out.println(e.getMessage());
//				}
//				
//				synchronized (resource2) {
//					System.out.println("Thread 1 locked resource2");
//				}
//			}
//		};
//		
//		Thread t2 = new Thread() {
//			public void run() {
//				synchronized(resource2) {
//					System.out.println("Thread 2 locked resource2");
//				}
//				
//				try {
//					Thread.sleep(500);
//				} catch(InterruptedException e) {
//					System.out.println(e.getMessage());
//				}
//				
//				synchronized (resource1) {
//					System.out.println("Thread 2 locked resource1");
//				}
//			}
//		};
//		
//		t1.start();
//		t2.start();
	}

}
