package M1;

import java.util.HashSet;

public class Q62 {
	public static void main(String[] args) {
		
		// Creating new Hashset
		HashSet<String> set = new HashSet<String>();
		
		// add objects in set
		set.add("SHIVAM");
		set.add("MEET");
		set.add("NAIM");
		set.add("KHUSHI");
		set.add("RISHI");
		
		// displaying elements
		System.out.println("Original hashset : "+set);
		
		// size of hashset
		System.out.println("Size of Hashset : "+set.size());
	}
}