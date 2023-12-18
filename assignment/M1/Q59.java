package M1;

import java.util.ArrayList;
import java.util.Collections;

public class Q59 {
	public static void main(String[] args) {
		
		// Creating new ArrayList
		ArrayList list = new ArrayList();
		
		// add elements in ArrayList
		list.add("Red");
		list.add("Green");
		list.add("White");
		list.add("Black");
		list.add("Purple");
		
		// before shuffle  Printing elements 
		System.out.println("before shuffle : "+list);
		
		Collections.shuffle(list);
		
		// After shuffle  Printing elements 
		System.out.println("after shuffle : "+list);
	}
}