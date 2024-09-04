package interfacepkg;

@FunctionalInterface
public interface Interface1 {
	//default method in interface
	public default void method1() {
		System.out.println("In functional interface");
	}
	
	//static method in interface
	public static void staticMethod() {
		System.out.println("static method in interface");
	}
	
	//overloaded default method
	public default String method1(String str) {
		return str;
	}
	
	//abstract method in interface
	public void myMethod(int a, int b);
//	public void method2();
}
