package com.springpeople.SpringBootExecutorFramework.threads;

import com.springpeople.SpringBootExecutorFramework.resource.SharedResource;

public class WorkerThread implements Runnable{
	private String message;
	
	public WorkerThread() {}
	
	public WorkerThread(String message) {
		this.message = message;
	}
	
	private void processMessage() {
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " (start) message = " + message);
		processMessage();
		System.out.println(Thread.currentThread().getName() + " (end)");
	}
 	
	
	//	private SharedResource resource;
//
//	public WorkerThread(SharedResource resource) {
//		this.resource = resource;
//	}
//	
//	public WorkerThread() {}
//
//	@Override
//	public void run() {
//		resource.incrementCounter();
//	}
//	
	
}
