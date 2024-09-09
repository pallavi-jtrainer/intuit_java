package threadPkg;

//public class Worker implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Hello " + i);
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//		
//	}
//
//}

public class Worker extends Thread {
	private Integer count = 0;
	
//	private Object lock = new Object();
	
//	public void process() {
//		for(int i = 0; i < 10; i++) {
//			System.out.println("Thread name: " + Thread.currentThread().getName());
//			
//			try {
//				Thread.sleep(1000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			count++;
//			
//			System.out.println(count);
//		}
//	}
	
	public void stage1() {
		
		synchronized (this) {
			for(int i = 0; i < 10; i++) {
				System.out.println("Thread name: " + Thread.currentThread().getName());
				
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
					
					System.out.println("Thread name: " + Thread.currentThread().getName()
							+" is interrupted");
				}
				count++;
				
				System.out.println(count);
			}
		}
		
		System.out.println("Unsynchronized");
		
	}
	
	public synchronized void stage2() {
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread name: " + Thread.currentThread().getName());
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			count++;
			
			System.out.println(count);
		}
	}

	public void myMethod() {
		Thread t1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stage1();
			}
		});
		
		Thread t2 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				stage1();
			}
		});
		
//		System.out.println("Thread - 1 priority: " + t1.getPriority());
//		t1.setPriority(2);
		t1.start();

		t2.start();
		
		try {
			t1.join();
			t2.join();
			
//			if(count == 5) {
//				t1.interrupt();
//				t2.notify();
//			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
