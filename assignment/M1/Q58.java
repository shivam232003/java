package M1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Q58 {
	public static void main(String[] args) {
		
		// Creating a  ArrayList
		List<String> List1 = new ArrayList<String>();
		
		// Add element to list
		  List1.add("1");
		  List1.add("2");
		  List1.add("3");
		  List1.add("4");
		
		// display arrayList
		  System.out.println("List1: " + List1);
		
		// create a new ArrayList
		  List<String> List2 = new ArrayList<String>();
		  
		  // add elements in new ArrayList
		  List2.add("A");
		  List2.add("B");
		  List2.add("C");
		  List2.add("D");
		  
		  // print
		  System.out.println("List2: " + List2);
		  
		// Copy List2 to List1
		  Collections.copy(List1, List2);
		  
		  
		  System.out.println("Copy List to List2,\nAfter copy:");
		  System.out.println("List1: " + List1);
		  System.out.println("List2: " + List2);
	}
}