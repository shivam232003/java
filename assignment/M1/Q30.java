package M1;

//Create an abstract class 'Bank'
abstract class Bank{
	
	// Create an abstract method 'getBalance'.
	abstract void getBalance();
}

//create first subclass BankA
class BankA extends Bank{

	// override the method of Parent class	
	@Override
	void getBalance() {
		System.out.println("Balance of Bank A : $100");
	}
}

//create second subclass BankB
class BankB extends Bank{

	// override the method of Parent class	
	@Override
	void getBalance() {
		System.out.println("Balance of Bank B : $200");
	}
}

//create third subclass BankA
class BankC extends Bank{

	// override the method of Parent class	
	@Override
	void getBalance() {
		System.out.println("Balance of Bank C : $300");
	}
}
public class Q30 {
	public static void main(String[] args) {
		
		// Create  an Object of First subclass
		BankA a = new BankA();
		
		// calling first child's overriden method
		a.getBalance();
		
		// Create  an Object of second subclass
		BankB b = new BankB();
				
		// calling second child's overriden method
		b.getBalance();
				
		// Create  an Object of third subclass
		BankC c = new BankC();
				
		// calling third child's overriden method
		c.getBalance();
	}
}
