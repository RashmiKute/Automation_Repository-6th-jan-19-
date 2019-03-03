package oops.abstraction;

public class User2 {

	public static void main(String[] args) {
		RBI ref=null;
		
		String name=bankName();
		
		if(name.equals("SBI")){
			ref=new SBI();
			
		}else if(name.equals("HDFC"))
		{
			ref=new HDFC();
			
		} else if(name.equals("Citi")){
			ref=new Citi();
		}
		
		//Band services - script
		ref.savingsAccount();
		ref.currentAccount();
		ref.creditCard();
		ref.debitCard();
	}

	public static String bankName() {
	
		return "SBI";
	}

}
