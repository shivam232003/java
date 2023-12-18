package M1;

import java.util.HashMap;

public class Q63 {
	public static void main(String[] args) {
		
		// Creating new hashmap
		HashMap map =  new HashMap();
		
		// adding objects in hashmap
		
		map.put(1, "java");
		map.put(2, "pyton");
		map.put(3, "php");
		map.put(4, "laravel");
		map.put(5, "ruby");
		
		// display map elements
		System.out.println("Key - value pair in map : "+map);
	}
}