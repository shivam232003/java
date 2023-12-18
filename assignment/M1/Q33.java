package M1;

abstract class Shape{
	
	abstract void RectengleArea(double length, double breadth);
	abstract void SquareArea(double side);
	abstract void CircleArea(double radius);
}

class Area extends Shape{

	@Override
	void RectengleArea(double length, double breadth) {
		double area = length * breadth;
		System.out.println("Area of Rectengle : "+area);
	}

	@Override
	void SquareArea(double side) {
		double area =  side * side;
		System.out.println("Area of Squre : "+area);
	}

	@Override
	void CircleArea(double radius) {
		double pi = 3.14;
		double area = pi * radius * radius;
		System.out.println("Area of Circle : "+area);
	}
	
}
public class Q33 {
	public static void main(String[] args) {
		
		// creating object of Area class
		Area a = new Area();
		
		// Calling methods of Area class
		a.RectengleArea(15.2, 8.5);
		
		a.SquareArea(30.10);
		
		a.CircleArea(6.5);
		
	}
}