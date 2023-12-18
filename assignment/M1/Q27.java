package M1;

//create a class Triangle
class Triangle{
	
	// create a constructor without parameters
	public Triangle() {
		int a = 6, b = 4, c = 5;
		int perimeter = a+b+c;
		System.out.println("Perimeter of Triangle : "+perimeter);
	}
}
public class Q27 {
	public static void main(String[] args) {
		
		// create an object of Triangle
		Triangle obj = new Triangle();
	}
}
