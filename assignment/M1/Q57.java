package M1;

import java.util.ArrayList;
import java.util.Collections;

public class Q57 {
	public static void main(String[] args) {
		
		// CreatinG new ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		// add objects in arrayList
		list.add("Honda");
		list.add("Shine");
		list.add("R15");
		list.add("Bullet");
		list.add("Pulsure");
		
		// printing list unsorted object
		System.out.println("Before sorting : "+list);
		
		Collections.sort(list);
		
		// printing list sorted object
		System.out.println("After sorting : "+list);
	}
}
