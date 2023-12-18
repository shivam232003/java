package M1;

import java.util.ArrayList;

public class Q66 {
	public static void main(String[] args) {
		
		// Create a new ArrayList
		ArrayList list = new ArrayList();
		
		// add elements in arraylist
		list.add("Java");
		list.add("php");
		list.add("python");
		list.add("c");
		list.add("c++");
		
		// Printing elements in list
		System.out.println("First List : "+list);
		
		// Creat a new ArrayList
		ArrayList list1 = new  ArrayList();
		
		// add objects in new list1
		list1.add("red");
		list1.add("yellow");
		list1.add("purple");
		list1.add("white");
		list1.add("pink");
		
		System.out.println("Second list : "+list1);
		
		// compare 2  array List
		System.out.println(list.containsAll(list1));
	}
}
