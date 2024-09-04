package mainpkg;

import interfacepkg.InterfaceImpl;

public class Main {
	public static void main(String[] args) {
		InterfaceImpl obj = new InterfaceImpl();
		
		obj.method1();
		System.out.println(obj.method1("Hello"));
	}
}
