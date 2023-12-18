package M1;

import java.util.Scanner;

public class Q36 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// in try block user enter age only int otherwise exception throws.
		
		  try {
	            System.out.print("Enter your age: ");
	            int age = sc.nextInt();
	            System.out.println("Your age is: " + age);
	        } 
		  catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter a valid age.");
	        } 
	}
}