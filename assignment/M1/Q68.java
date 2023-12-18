package M1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Q68 {
	public static void main(String[] args) {
		
		// Create a new ArrayList
		ArrayList list = new ArrayList();
		
		// add Objects in ArrayList
		list.add("Red");
		list.add("Black");
		list.add("White");
		list.add("Purple");
		list.add("Gray");
		
		
		// display elements before swaping'
		
		System.out.println("List before Swapping :");
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		// Swapping 1st(index 0) element with the 3rd(index 2) element
		Collections.swap(list, 0, 2);
		
		// display elements before swaping'
		
		System.out.println();
		System.out.println("After Swapping :");
		Iterator itr1 = list.iterator();
		
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
	}
}