package M1;
import java.util.Scanner;
public class Q8 {
	public static void main(String[] args) {
		// for user input number.
		Scanner sc = new Scanner(System.in);
		
		//take a number from user in range of int type only positive.
		System.out.println("Enter number within range of "+1+" to "+Integer.MAX_VALUE);
		int num = sc.nextInt();
		
		// count the digits of this number. for it take one variable.
		int count  = 0;							//count = 0				// num = 5 ! = 0
		while(num != 0) {						// num = 50 ! = 0		// num = 5 / 10
			num = num / 10;						// num = 50 /10 = 5		// count = 2
			count++;							// count = 1		// println(count);
		}
		System.out.println("Digits in number : "+count);
	}
}

