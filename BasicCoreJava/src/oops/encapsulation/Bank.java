package oops.encapsulation;

public class Bank {
	
	private int balance;
	private String customerName;      //we have used private because we want to hide the data from the user

	public int getBalance() {           //getters and setters are implemented by right click on class and then source
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>1000)
		{
		this.balance = balance+150;
		}
		else if(balance<1000){
			this.balance = balance-500;
		}
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	

}
