package M1;

import java.util.Scanner;

public class Q41 {
	public static void main(String[] args) {
		int age = 0;
		
		// handle exception in try - catch block 
		
		try {
			validate(age);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	// create validate method
	static void validate(int age) {
		Scanner sc = new Scanner(System.in);
		
		// take age as input from user.
		
		System.out.println("Enter your age :");
		age = sc.nextInt();
		
		// if user enter age < 18 it throw ArithmeticException .
		
		if(age  < 18) {
				throw new ArithmeticException("not valid");
		}
		else
		{
			System.out.println("Welcome to vote.");
		}
		
	}
}