package M1;

import java.util.ArrayList;
import java.util.List;

public class Q55 {
	public static void main(String[] args) {
		
		// Creating new ArrayList
		List list = new ArrayList();
		
		// add elements in arrayList
		list.add("java");
		list.add(2);
		list.add(true);
		list.add('m');
		list.add(12.2626262266);
		
		// printing an arraylist
		System.out.println(list);
		
		// remove the third element of list
		list.remove(2);
		System.out.println(list);
	}
}
