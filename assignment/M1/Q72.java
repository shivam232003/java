package M1;

import java.util.HashMap;
import java.util.Map;

public class Q72 {
	public static void main(String[] args) {
		
		// Create HashMap
		Map<Integer, String> abc = new HashMap<Integer, String>();
		
		// add key - value pairs in map
		abc.put(1, "Red");
		abc.put(2, "White");
		abc.put(3, "Blue");
		abc.put(4, "Pink");
		abc.put(5, "Black");
		
		System.out.println(abc);
		
		// check  if map  is empty or not
		System.out.println("Check if map empty :");
		
		System.out.println(abc.isEmpty());
		
//		// clear map
//		abc.clear();
//		
//		System.out.println(abc);
//		
//		System.out.println(abc.isEmpty());
	}
}