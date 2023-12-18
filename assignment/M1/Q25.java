package M1;

class Member{
	
	int Data_members,age;
	String Name,address;
	Long Phone_num;
	Double Salary;
	
	// create a printSalary method which prints salary
	
	public double printSalary(double Salary) {
		this.Salary = Salary;
		return Salary;
	}
}
public class Q25 {
	public static void main(String[] args) {
		// create an object of Member class
		
		Member obj = new Member();
		
		// Print salary through calling Member class's Method
		
		System.out.println("Salary is :"+obj.printSalary(50000.550));
	}
}