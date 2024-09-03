package nestedclassespkg;

public class OuterClass {
	private int val = 10;
	private static int val1 = 20;
	
	//instance inner class
	public class InnerClass {
		public void showVal() {
			System.out.println(val);
		}
	}
	
	public void valueData() {
		System.out.println(val);
	}
	
	//static inner class
	public static class StaticInner {
		public void showVal() {
			System.out.println(val1);
		}
	}
}
