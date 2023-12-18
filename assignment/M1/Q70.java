package M1;

import java.util.HashSet;

public class Q70 {
	public static void main(String[] args) {
		
		// Create a HashSet
		HashSet<String> set = new HashSet<String>();
		
		// Adding objects in empty hashset
		set.add("Word");
		set.add("Excel");
		set.add("Powerpoint");
		set.add("notepad");
		set.add("files");
		
		// Printing objects from Hashset
		System.out.println("Original Hashset : "+set);
		
		// Creating an array.
		String[] array = new String[set.size()];
		
		set.toArray(array);
		
		 // Displaying Array elements
		System.out.println();
		System.out.println("Array Elements : ");
		
		for(String s: array) {
			System.out.println(s);
		}
	}
}