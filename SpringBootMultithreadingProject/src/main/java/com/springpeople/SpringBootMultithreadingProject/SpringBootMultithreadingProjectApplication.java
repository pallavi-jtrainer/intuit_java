package com.springpeople.SpringBootMultithreadingProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootMultithreadingProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootMultithreadingProjectApplication.class, args);
	
		WorkerThread obj = new WorkerThread();
		
		Thread t1 = new Thread() {
			public void run() {
//				obj.printData(12);
				WorkerThread.printData(12);
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
//				obj.printData(10);
				WorkerThread.printData(10);
			}
		};
		
		Thread t3 = new Thread() {
			public void run() {
//				obj.printData(10);
				WorkerThread.printData(10);
			}
		};
		
		t1.start();
		t2.start();
		t3.start();
				
	}

}