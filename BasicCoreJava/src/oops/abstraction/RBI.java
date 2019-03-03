package oops.abstraction;

public interface RBI extends Modi,SupremeCourt
{

	public void savingsAccount();              //here we not using abstract key word because by default it assume them to be abstract and doesn't allow a concrete method.
	public void currentAccount();
	public void creditCard();
	public void debitCard();
	
	
}
