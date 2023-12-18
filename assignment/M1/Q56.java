package M1;

import java.util.ArrayList;
import java.util.Scanner;

public class Q56 {
	public static void main(String[] args) {
		
		// Creating new ArrayList
		ArrayList<String> list = new ArrayList<String>();
		
		// add String elements
		list.add("Red");
		list.add("Green");
		list.add("Black");
		list.add("White");
		list.add("Yellow");
		list.add("Purple");
		
		// Printing List
		System.out.println(list);
		
		
		// Search the element 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter color name you find : ");
		String color = sc.nextLine();
		
		if(list.contains(color)) {
			System.out.println("Found the element");
		}
		else {
			System.out.println("Element not found !");
		}
	}
}