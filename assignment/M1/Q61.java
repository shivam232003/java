package M1;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class Q61 {
	public static void main(String[] args) {
		
		// Creating new HashSet
		HashSet set = new HashSet();
		
		// add objects in set
		set.add(true);
		set.add("java");
		set.add(123);
		set.add('m');
		set.add(12.4560);
		
		// display elements of  set
		System.out.println(set);
		
		// itrate all elements by Iterator
		
		Iterator itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}
}
