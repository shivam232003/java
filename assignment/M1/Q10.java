package M1;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		// Take user input a char
		System.out.println("Enter any character :");
		char ch = scanner.next().charAt(0);
		
		// convert char into int value (ASCII value)
		int i = ch;
		
		System.out.println("Ascii value of "+ch+" is : "+i);
	}
}