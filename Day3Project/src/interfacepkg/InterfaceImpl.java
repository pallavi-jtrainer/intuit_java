package interfacepkg;

public class InterfaceImpl implements Interface1{

	@Override
	public void myMethod() {
		
	}
	
	public String newMethod() {
//		method1();
		Interface1.staticMethod();
		return "In implementation class";
	}

}
