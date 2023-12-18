package M1;

import java.util.Scanner;

public class Q9 {


public static void main(String[] args) {
	// for user input 
	Scanner scanner = new Scanner(System.in);
	
	// take string as input from user
	System.out.println("Enter any String :");
	String str  = scanner.nextLine();
	char[] ch = str.toCharArray();
	
	int letter=0,nums=0,space=0,other=0;
	for(int i=0; i<str.length(); i++) {
		
		if(Character.isLetter(ch[i])) {
			letter++;
		}
		else if(Character.isDigit(ch[i])) {
			nums++;
		}
		else if(Character.isSpaceChar(ch[i])) {
			space++;
		}
		else {
			other++;
		}
	}
	
	System.out.println("Letters : "+letter);
	System.out.println("Numbers : "+nums);
	System.out.println("Spaces : "+space);
	System.out.println("Others : "+other);
}
}