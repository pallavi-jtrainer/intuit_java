package interfacepkg;

public class InterfaceImpl implements Interface1{

//	@Override
//	public void myMethod() {
//		
//	}
//	
	public String newMethod() {
//		method1();
		Interface1.staticMethod();
		return "In implementation class";
	}

@Override
public void myMethod(int a, int b) {
	// TODO Auto-generated method stub
	
}

}
