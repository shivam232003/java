package M1;

//create a class named Shape
class Shape1{
	
	// create a method
	public void print() {
		System.out.println("This is Shape.");
	}
}

//create class Rectangle which inherit Shape class
class Rectangle1 extends Shape1{
	
	// create a method
	public void m1() {
		System.out.println("This is rectangular shape");
	}
}

//create class  which inherit Shape class
class Circle1  extends Shape1{
	
	// create a method
		public void m2() {
			System.out.println("This is circular shape");
		}
}

//create a sub class of Rectangle class
class Squre1 extends Rectangle1{
	
	// create a method
	public void m3() {
		System.out.println("This is rectangular shape");
	}
}
public class Q35 {
	public static void main(String[] args) {
		
		// creating an object of  Square class
		Squre1 s = new Squre1();
		
		s.m1();
		s.print();
	}
}