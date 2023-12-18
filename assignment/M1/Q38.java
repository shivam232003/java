package M1;

import java.util.Scanner;

public class Q38 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// take an array size
		System.out.println("Enter Array size : ");
		int size = sc.nextInt();
		
		// take an array and give it size
		int[] a = new int[size];
		
		// take elements
		for(int index=0; index<a.length; index++) {
			
			System.out.print("Enter element ar arr["+index+"] index :");
			a[index] = sc.nextInt();
		}
		System.out.println();
		
		System.out.println(a[4]);
		
		
		// try - catch for exception handling
		try {
			System.out.println(a[4]/0);
		}
		catch(ArrayIndexOutOfBoundsException e1) {
			e1.printStackTrace();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
