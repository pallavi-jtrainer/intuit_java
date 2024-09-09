package mainpkg;

import threadPkg.Worker;

public class Main {

	public static void main(String[] args) {
//		String str = "string1";
//		str = "another string";
//		
////		String str = new String("string1");
////		str = new String("another string");
//		
//		String str1 = "new string";
//		str1 = str.concat(" " + str1);
////		System.out.println(str1);
//		System.out.println(str1.getClass());
//		
//		Thread t1 = new Thread(new Worker());
//		Thread t2 = new Thread(new Worker());
		
//		Thread t1 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
////				new Worker().process();
//				new Worker().stage1();
//				
//			}
//		});
//		
//		
//		Thread t2 = new Thread(new Runnable() {
//			
//			@Override
//			public void run() {
////				new Worker().process();
//				new Worker().stage2();
//				
//			}
//		});
//		
//		try {
//			Thread.sleep(3000);
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
//		
		long start = System.currentTimeMillis();
		
		Worker w = new Worker();
		w.myMethod();
//		
//		t1.start();
//		t2.start();
//		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end - start));
////		System.out.println("After thread completion");
//		
	}

}
