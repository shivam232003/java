package M1;

import java.util.ArrayList;

public class Q73 {
	public static void main(String[] args) {
		
		// Create ArrayList
		ArrayList list = new ArrayList();
		
		// add Objects in ArrayList
		list.add("flat");
		list.add("Home");
		list.add("Tenament");
		
		// Displaying elements 
		System.out.println("Main List : "+ list);
		
		// Increase capacity 
		list.ensureCapacity(3);
		list.add("bike");
		list.add("bicycle");
		list.add("car");
		
		System.out.println("New ArrayList : "+ list);
	}
}