package M1;

public class Q13 {
	public static void main(String[] args) {
		// print numbers using for loop
		
		System.out.println("Numbers divisible by 3, 5 and both :");
		
		for(int i=1; i<=100; i++) {
			if((i % 3 == 0 && i % 5 == 0)||( i % 3 == 0)|| (i % 5 == 0)) {
				System.out.println(i);
			}
		}
	}
}
