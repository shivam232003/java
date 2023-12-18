package M1;

import java.util.Scanner;

public class Q5 {
public static void main(String[] args) {
	System.out.println("input any 5 no.:");
	Scanner in =new Scanner(System.in);
	int n1=in.nextInt();
	int n2=in.nextInt();
	int n3=in.nextInt();
	int n4=in.nextInt();
	int n5=in.nextInt();
	
	int sum=n1+n2+n3+n4+n5;
	System.out.println("sum="+sum);
	System.out.println("avg="+sum/5);
}
}
