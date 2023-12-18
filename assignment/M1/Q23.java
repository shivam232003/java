package M1;

class AreaOf{
	
	// area of rectangle area = length * breadth

	public double Area(double length, double breadth) {
		double area = length * breadth;
		return area;
	}
	
	// area of Square area = side * side
	
	public double Area(double side) {
		double area = side * side;
		return area;
	}
}
public class Q23 {
	public static void main(String[] args) {
	
		AreaOf obj = new AreaOf();
		
		System.out.println("Area of Rectengle : "+ obj.Area(12.5, 20.50));
		
		System.out.println("Area of Squre : "+ obj.Area(30.00));
	}
}
