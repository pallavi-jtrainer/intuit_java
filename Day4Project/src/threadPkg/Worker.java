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
	private int count;
	
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
	
	public synchronized void stage1() {
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
	
	
}
