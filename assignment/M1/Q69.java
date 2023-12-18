package M1;

import java.util.ArrayList;

public class Q69 {
	public static void main(String[] args) {
		
		// Create a ArrayList
		ArrayList list = new ArrayList();
		
		// adding objects in ArrayList
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		// Display objects 
		System.out.println("First List : "+list);
		
		// Create a ArrayList
		ArrayList list1 = new ArrayList();
				
		// adding objects in ArrayList
		list1.add(6);
		list1.add(7);
		list1.add(8);
		list1.add(9);
		list1.add(10);
				
		// Display objects 
		System.out.println("Second List : "+list1);
		
		// Join two lists
		
		ArrayList list2 = new ArrayList();
		
		list2.addAll(list);
		list2.addAll(list1);
		
		System.out.println("Combine both lists : "+list2);
	}
}