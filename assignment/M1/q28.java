package M1;

//Create an abstract class  Parent with message method
abstract class Parent{
	
	// create an abstract method message
	
	public abstract void message();
}

//create first child class extends parent class
class A_one extends Parent{

	// override the message method of Parent class	
	@Override
	public void message() {
		
		System.out.println("This is first subclass");
	}
	
}

//create second child class  extends  Parent class
class A_two extends Parent{

	// override the message method of Parent class	
	@Override
	public void message() {
		
		System.out.println("This is second subclass");
	}
	
}
public class q28 {
	public static void main(String[] args) {
		
		// Create  an Object of First child class
		A_one a1 = new A_one();
		
		// calling first child's overriden method
		a1.message();
		
		// Create  an Object of second child class
		A_two a2 = new A_two();
				
		// calling second child's overriden method
		a2.message();
	}
}
