package oops.abstraction;

public class User {

	public static void main(String[] args) 
	{
		
		RBI ref;
		
		ref=new HDFC();
		ref.savingsAccount();
		ref.currentAccount();
		ref.creditCard();
		ref.debitCard();
		
		ref=new SBI();
		ref.savingsAccount();
		ref.currentAccount();
		ref.creditCard();
		ref.debitCard();
		
		ref=new Citi();
		ref.savingsAccount();
		ref.currentAccount();
		ref.creditCard();
		ref.debitCard();
		
	}
	
	
}
