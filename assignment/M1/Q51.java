package M1;

import java.util.ArrayList;
import java.util.Iterator;

public class Q51 {
	public static void main(String[] args) {
		
		// Creating new arrayList
		ArrayList list = new ArrayList();
		
		// add elements in it
		list.add(1);
		list.add(15);
		list.add(20);
		list.add(45);
		list.add(60);
		list.add(23);
		
		// Printing elements
		System.out.println(list);
		
		// retrive elements from arraylist by Iterator
		
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}