package interfacepkg;

public class ImplClass {
	
	public void clasMethod() {
		Interface1 obj = (a, b) -> {
				System.out.println("implementation of abstract method");
				System.out.println(a + b);
		};
		obj.myMethod(3 ,5);
	}
}
