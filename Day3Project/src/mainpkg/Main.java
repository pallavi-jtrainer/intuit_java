package mainpkg;

import java.text.NumberFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import collectionspkg.CollectionsDemo;
import filespkg.FileIO_Demo;
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
			System.out.println("Enter Product Id to update: ");
			int id1 = sc.nextInt();
			
			//Product prod = new Product();
			
			for(Product p: products) {
				if(p.getId() == id1) {
					System.out.println("Enter the new price: ");
					double pr = sc.nextDouble();
					p.setPrice(pr);
					break;
				}
			}
			break;
		case 5:
			System.out.println("Enter Product Id to remove: ");
			int id2 = sc.nextInt();
			
			for(Product p: products) {
				if(p.getId() == id2) {
					int index = products.indexOf(p);
					Product ele = products.remove(index);
					System.out.println("Removed product: " + ele);
					break;
				}
			}
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
		double d = 123450.30;
		
//		NumberFormat nf = NumberFormat.getInstance(Locale.getDefault());
//		System.out.println(nf.format(d));
//		
	
//		NumberFormat nf = NumberFormat.getCurrencyInstance();
//		System.out.println(nf.format(d));
		
		LocalDate ld = LocalDate.now();
		System.out.println(ld);
		
		ld = ld.plusDays(5);
		System.out.println(ld);
		
//		Date date = new Date();
//		System.out.println(date);
		
//		FileIO_Demo f = new FileIO_Demo();
////		f.writeToFileByte();
////		f.readFromFile();
//		f.readWriteFile();
		
//		ArrayList<Product> products = new ArrayList<Product>();
		
//		Main obj = new Main();
//		obj.menu(products);
//		
//		InterfaceImpl obj = new InterfaceImpl();
//		
//		obj.method1();
//		System.out.println(obj.method1("Hello"));
		
//		CollectionsDemo obj = new CollectionsDemo();
//		obj.pqDemo();
//		obj.listDemo2();
		//obj.setDemo();
		
//		obj.mapDemo();
	}
}
