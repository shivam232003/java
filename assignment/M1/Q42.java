package M1;


import java.util.Scanner;

// creating a class Account
class Account{
	
	int balance = 5000;
	int amt;
	
	// creating a method withdrawl
	public void withdrawal() {
		
		this.balance = balance;
		this.amt = amt;
		// for user input amount 
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Account total Balance : "+ balance);
		
		System.out.println("Enter amount to withdraw: ");
		amt = sc.nextInt();	
	}
	
	// create another method for custom exception
	public void perform() {

		if(amt > balance) {
			throw new ArithmeticException("Sorry, insufficient balance, you need more "+(amt-balance)+"Rs. to perform this transection.");
		}
		else {
			System.out.println("Withdrawl sucess");
		}
	}
}
public class Q42 {
	public static void main(String[] args) {
			
		// Creating an object of Account class
		Account ac = new  Account();
		ac.withdrawal();
		
		// handle exception in try - catch block.
		try {
			ac.perform();
		}
		catch(ArithmeticException e) {
			System.out.println(e);
		}
		
	}
}
