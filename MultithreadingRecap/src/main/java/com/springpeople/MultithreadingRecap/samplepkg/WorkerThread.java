package com.springpeople.MultithreadingRecap.samplepkg;

import com.springpeople.MultithreadingRecap.App;

public class WorkerThread implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"
				+ App.t1.getState());
		
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
