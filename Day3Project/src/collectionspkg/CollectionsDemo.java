package collectionspkg;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

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
	
	public void pqDemo() {
		Queue<Integer> numbers = new PriorityQueue<Integer>();
		numbers.add(2);
		numbers.add(3);
		numbers.add(1);
		numbers.add(10);
		numbers.add(12);
		numbers.add(32);
		numbers.add(4);
		numbers.add(9);
		
		System.out.println("Initial Q: " + numbers);
		
		int ele = numbers.remove();
		System.out.println("Removed ele: " + ele);
		System.out.println(numbers);
	}
	
	public void setDemo() {
		Set<Integer> numbers = new HashSet<Integer>();
		numbers.add(3);
		numbers.add(1);
		numbers.add(10);
		numbers.add(12);
		numbers.add(32);
		numbers.add(4);
		numbers.add(9);
		numbers.add(3);
		
		System.out.println(numbers);
		
		Set<Integer> nums = new HashSet<Integer>();
		nums.add(1);
		nums.add(11);
		nums.add(17);
		nums.add(2);
		
	//	nums.addAll(numbers);
//		nums.retainAll(numbers);
		nums.removeAll(numbers);
		
		System.out.println(nums);
		
	}
	
	public void mapDemo() {
//		Map<String, Integer> numbers = new HashMap<String, Integer>();
//		
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//		numbers.put("three", 3);
//		
//		
//		System.out.println("Initial: " + numbers);
//		
//		System.out.println("Keys: " + );
		
		Map<Integer, Product> products = new HashMap<Integer, Product>();
		products.put(1, new Product(1, "P1", 12));
		products.put(2, new Product(2, "P2", 23));
		
		System.out.println(products);
		System.out.println("Keys: " + products.keySet());
		System.out.println("Values: " + products.values());
		
		System.out.println("EntrySet: " + products.entrySet());
		
	}
}
