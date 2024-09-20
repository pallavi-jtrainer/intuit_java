package com.springpeople.SpringBootExecutorFramework.resource;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {

	private int counter;
	private Lock lock;
	
	public SharedResource() {
		counter = 0;
		lock = new ReentrantLock();
	}
	
	public void incrementCounter() {
		lock.lock();
		
		try {
			counter++;
			System.out.println("In incrementCounter method. Counter: " + counter);
		} finally {
			lock.unlock();
		}
	}
	
	public int getCounter() {
		return counter;
	}
}
