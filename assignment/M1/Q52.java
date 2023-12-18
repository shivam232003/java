package M1;

import java.util.ArrayList;

public class Q52 {
	public static void main(String[] args) {
		
		// Create a new ArrayList
		ArrayList list = new ArrayList();
		
		// add elements
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		
		// display arrayList
		System.out.println(list);
		
		// insert new element at first position
		list.add(0, 100);
		
		// display new arrayList
		System.out.println(list);
	}
}