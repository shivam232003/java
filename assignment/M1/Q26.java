package M1;

class Rectangle{
	
	//create data members
	double length, breadth;
	
	// create a constructor for initialize value
	public Rectangle(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	// create two method for print area and perimeters of Rectangle
	public double area() {
		return length * breadth;
		
	}
	
	public double perimeter() {
		return 2*(length + breadth);
	}
}

// create SquAre class which extends Rectangle 
class Squre extends Rectangle{

	public Squre(double side) {
		super(side, side);
	}
	
}
public class Q26 {
	public static void main(String[] args) {
		
		 // Creating an object of Rectangle
        Rectangle rectangle = new Rectangle(5, 8);
        
        System.out.println("Area of Rectangle : "+rectangle.area());
        System.out.println("Perimeter of Rectangle : "+rectangle.perimeter());
        
        // Creating an object of Square
        Squre square = new Squre(4);

        System.out.println("Area of Squre : "+square.area());
        System.out.println("Perimeter of Squre : "+square.perimeter());
	}
}