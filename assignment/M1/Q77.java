package M1;

import java.util.HashMap;
import java.util.Map;

public class Q77 {
	public static void main(String[] args) {
		
		// Creating HashMap
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		// add objects
		map.put(1, "java");
		map.put(2, "python");
		map.put(3, "php");
		map.put(4, "ruby");
		map.put(5, "c++");
		
		// Collection view of the values
		System.out.println("Collection view of the values");
		System.out.println(map.values());
	}
}