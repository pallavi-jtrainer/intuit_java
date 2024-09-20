package com.springpeople.SpringBootMultithreadingProject;

public class WorkerThread {

	public synchronized static void printData(int x) {
		for(int i = 0; i < x; i++) {
			System.out.println(i * x);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
