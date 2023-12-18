package M1;

import java.util.ArrayList;

public class Q65 {
	public static void main(String[] args) {
		
		// Create an ArrayList
		ArrayList list = new ArrayList();
		
		// add objects in ArrayList
		list.add("Apple");
		list.add("Banana");
		list.add("Mango");
		list.add("Grapes");
		list.add("Orange");
		list.add("Strawbarry");
		
		// Displaying elements from list
		System.out.println("Original list : "+list);
		
		System.out.println("Reversed List : "+list.reversed());
	
	}
}
