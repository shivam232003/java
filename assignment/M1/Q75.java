package M1;

import java.util.ArrayList;
import java.util.List;

public class Q75 {
	public static void main(String[] args) {
		
		//New Arraylist
		List list = new ArrayList();
		
		// add objects
		list.add("java");
		list.add("python");
		list.add("c");
		list.add("c++");
		list.add("kotlin");
		list.add("dart");
		
		// print
		System.out.println("ArrayList : "+list);
		
		System.out.println();
		
		System.out.println("ArrayList by Index Postion");
		//print elements using position of element
		for(int index=0; index<list.size(); index++) {
			System.out.println(list.get(index));
		}
	}
}
