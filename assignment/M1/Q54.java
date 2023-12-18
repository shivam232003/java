package M1;

import java.util.ArrayList;
import java.util.List;

public class Q54 {
	public static void main(String[] args) {
		
		// creating new list
		List list = new ArrayList();
		
		// add elements in list
		list.add(1);
		list.add("Java");
		list.add(true);
		list.add('m');
		list.add(152.2365);
		
		// display list
		System.out.println(list);
		
		// update specific element in ArrayList
		list.set(1, "Python");
		
		System.out.println(list);
	}
}