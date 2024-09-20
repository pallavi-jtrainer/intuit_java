package com.springpeople.SpringBootExecutorFramework.threads;

import com.springpeople.SpringBootExecutorFramework.resource.SharedResource;

public class WorkerThread implements Runnable{
	private SharedResource resource;

	public WorkerThread(SharedResource resource) {
		this.resource = resource;
	}
	
	public WorkerThread() {}

	@Override
	public void run() {
		resource.incrementCounter();
	}
	
	
}
