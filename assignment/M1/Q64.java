package M1;

import java.util.HashMap;
import java.util.Map;

public class Q64 {
	public static void main(String[] args) {
		
		// Create a HashMap
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		// add  key- value pairs into map
		map.put("Red", 1);
		map.put("Black", 2);
		map.put("White", 3);
		map.put("Orange", 4);
		map.put("Yellow", 5);
		
		// display key - value pair in HashMap
		System.out.println("key-value pair in map : "+map);
		
		//count the number of key-value (size) mappings in map
		System.out.println("Number of pairs in map : "+map.size());
	}
}
