package collectionspkg;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import model.Product;

public class CollectionsDemo {

	public void listDemo() {
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(2);
		numbers.add(4);
		numbers.add(0, 1);
		
		System.out.println("Initial list: " + numbers);
		
		numbers.set(2, 10);
		System.out.println("After set: " + numbers);
	}
	
	public void listDemo2() {
		List<Product> products = new ArrayList<Product>();
		
		products.add(new Product(1, "Pen", 23.00));
		products.add(new Product(2, "Pencil", 12.00));
		products.add(new Product(3, "Eraser", 10.00));
		products.add(new Product(4, "Sharpner", 20.00));
		
//		System.out.println(products);
		
//		for(int i = 0; i < products.size(); i++) {
//			System.out.println(products.get(i));
//		}
		
//		for(Product p: products) {
//			System.out.println(p);
//		}
		
		Iterator<Product> itr = products.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		
		
		
	}
}
