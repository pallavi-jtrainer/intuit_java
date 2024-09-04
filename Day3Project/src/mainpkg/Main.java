package mainpkg;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import collectionspkg.CollectionsDemo;
import interfacepkg.InterfaceImpl;
import model.Product;

public class Main {
	private void menu(ArrayList<Product> products) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. View All Products");
		System.out.println("2. View Product Details");
		System.out.println("3. Add a new Product");
		System.out.println("4. Update Product Price");
		System.out.println("5. Delete a Product");
		System.out.println("6. Exit");
		
		System.out.println("Enter your choice: ");
		int ch = sc.nextInt();
		switch(ch) {
		case 1:
			for(Product p: products) {
				System.out.println(p.toString());
			}
			break;
		case 2:
			System.out.print("Enter product id: ");
			int id = sc.nextInt();
			System.out.println("Product Details: ");
			for(Product p: products) {
				if(p.getId() == id) {
					System.out.println(p.toString());
					break;
				}
			}
			break;
		case 3:
			System.out.print("Enter Product Id: ");
			int pId = sc.nextInt();
			System.out.print("Enter Product Name: ");
			String name = sc.next();
			System.out.print("Enter Product Price: ");
			double price = sc.nextDouble();
			
			products.add(new Product(pId, name, price));
			break;
		case 4:
			break;
		case 5:
			break;
		case 6:
			System.out.println("Exiting");
			System.exit(0);
		default:
			System.out.println("Wrong choice");
		}
		menu(products);
	}
	public static void main(String[] args) {
		ArrayList<Product> products = new ArrayList<Product>();
		
		Main obj = new Main();
		obj.menu(products);
		
//		InterfaceImpl obj = new InterfaceImpl();
//		
//		obj.method1();
//		System.out.println(obj.method1("Hello"));
		
//		CollectionsDemo obj = new CollectionsDemo();
//		obj.listDemo2();
	}
}
