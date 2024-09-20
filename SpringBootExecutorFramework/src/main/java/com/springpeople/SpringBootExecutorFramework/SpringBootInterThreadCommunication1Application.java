package com.springpeople.SpringBootExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springpeople.SpringBootExecutorFramework.resource.SharedResource;
import com.springpeople.SpringBootExecutorFramework.threads.WorkerThread;

@SpringBootApplication
public class SpringBootInterThreadCommunication1Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootInterThreadCommunication1Application.class, args);
	
		//SharedResource resource = new SharedResource();
		int nThreads = 5;
		
		ExecutorService service = Executors.newFixedThreadPool(nThreads);
		
		for(int i = 0; i <nThreads; i++) {
			Runnable worker = new WorkerThread("" + i);
			service.execute(worker);
		}
		
		service.shutdown();
		
		while(!service.isTerminated()) {
			//System.out.println("thread terminated");
		}
		
		System.out.println("All threads executed");
		
//		for(int i = 0; i < nThreads; i++) {
//			Runnable worker = new WorkerThread(resource);
//			service.execute(worker);
//		}
//		
//		service.shutdown();
//		
//		try {
//			service.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS);
//		} catch (InterruptedException e) {
//			System.out.println(e.getMessage());
//		}
//		
//		System.out.println("Counter: " + resource.getCounter());
	}

}
