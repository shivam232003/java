package M1;

import java.util.HashSet;
import java.util.Set;

public class Q76 {
	public static void main(String[] args) {
		
		// Create First HashSet
		Set<String> set = new HashSet<String>();
		
		// add objects
		set.add("Red");
		set.add("White");
		set.add("Black");
		set.add("Blue");
		
		// print
		System.out.println("First HashSet : "+set);
		
		System.out.println();
		
		// Create Second HashSet
		Set<String> set1 = new HashSet<String>();
				
		// add objects
		set1.add("Yellow");
		set1.add("White");
		set1.add("Black");
		set1.add("Orange");
				
		// print
		System.out.println("Second HashSet : "+set1);
		
		set.retainAll(set1);
		
		System.out.println("Same elements in both sets : ");
		System.out.println(set);
	}
}