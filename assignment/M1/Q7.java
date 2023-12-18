package M1;
 
public class Q7 {
	public static void main(String[] args) {
		// take a variable for increment of numbers by one.
		int k = 1;
		
		// for  print pattern using for loop here
		
		for(int i=1; i<=4; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(k+" ");
				k++;
			}
			System.out.println();
		}
	}
}
