package collections;

public class LimitationsOfArray {
 
	public static void main(String[] args) {
		int a=10;
		String str="Rashmi";
		char gender='M';
		boolean status=true;

		Object[] obj= new Object[4];
		
		obj[0]=a;
		obj[1]=str;
		obj[2]=gender;
		obj[3]=status;
		obj[4]=new LimitationsOfArray();
		
		

	}

}
