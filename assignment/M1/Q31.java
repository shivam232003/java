package M1;

//Create an abstract class Marks
abstract class Marks{
	
	//Create an abstract method getPercentage
	abstract double getPercentage();
}

//create class A for Student A
class A extends Marks{
	private double mark1,mark2,mark3;
	
	// create constructor which takes  marks
	public A(double mark1,double mark2,double mark3) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;	
	}

	// override the method of Parent(Marks) class
	@Override
	double getPercentage() {
		double total = mark1 +  mark2 + mark3;
		double pr =  (total / 300) * 100;
		return pr;
	}
}

//create class B for Student B
class B extends Marks{
	private double mark1,mark2,mark3,mark4;
	
	// create constructor which takes  marks
	public B(double mark1,double mark2,double mark3,double mark4) {
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		this.mark4 = mark4;
	}

	// override the method of Parent(Marks) class
	@Override
	double getPercentage() {
		double total = mark1 +  mark2 + mark3 + mark4;
		double pr =  (total / 400) * 100;
		return pr;
	}
}
public class Q31 {
	public static void main(String[] args) {
		
		// create  an object of class A
		A a =  new A(50, 70, 75);
		System.out.println("Percentage of Student A :"+a.getPercentage());
		
		// create  an object of class A
		B b =  new B(65, 55, 70,75);
		System.out.println("Percentage of Student B :"+b.getPercentage());
	}
}
