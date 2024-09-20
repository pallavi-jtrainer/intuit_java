package com.springpeople.MultithreadingRecap;

import com.springpeople.MultithreadingRecap.samplepkg.WorkerThread;

/**
 * Hello world!
 */
public class App implements Runnable{
	
	public static Thread t1;
	public static App obj;
	
    public static void main(String[] args) {
        //System.out.println("Hello World!");
    	obj = new App();
    	t1 = new Thread(obj);
    	
    	System.out.println("The state of Thread t1 after spawning: " + t1.getState());
    	
    	t1.start();
    	
    	System.out.println("The state of Thread t1 after calling start(): " + t1.getState());
    }
    
    @Override
    public void run() {
    	WorkerThread worker = new WorkerThread();
    	
    	Thread t2 = new Thread(worker);
    	
    	System.out.println("The state of Thread t2 after spawning: " + t2.getState());
    	t2.start();
    	
    	System.out.println("The state of Thread t2 after calling start(): " + t2.getState());
    	
    	try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("The state of thread t2 after invoking sleep(): "+ t2.getState() );  
    
    	try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	System.out.println("The state of thread t2 after completion: "+ t2.getState() );  
    }
}
