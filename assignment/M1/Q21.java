package M1;

//create class named 'Print Number'.

class PrintNumber{
	
	public int print(int n1) {
		return n1;
	}
	public float print(float n2) {
		return n2;
	}
	public double print(double n3) {
		return n3;
	}
	public long print(long n4) {
		return n4;
	}
}
public class Q21 {
	public static void main(String[] args) {
		// Create Object of Class
		PrintNumber p = new PrintNumber();
		System.out.println("int value :"+p.print(20));
		System.out.println("float value :"+p.print(12.203040));
		System.out.println("double value :"+p.print(36.2326958989));
		System.out.println("long value :"+p.print(656565656));
		
	}
}
