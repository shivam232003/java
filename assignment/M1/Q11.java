package M1;
import java.util.Scanner;

	public class Q11 {
		public static void main(String[] args) {
			
			// for user input
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter any number :");
			
			int n = scanner.nextInt();
			int nn = n*10  + n ; // 5 * 10 = 50 + 5 = 55
			int nnn = n*100 + nn;//5*100=500+5+5=510
			int sum = n+nn+nnn;
			
			System.out.println("n+nn+nnn : "+sum);
		}
	}
