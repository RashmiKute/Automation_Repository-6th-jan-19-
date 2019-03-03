package variablesAndDataTypes;

public class Day1 {

	String city="Pune";  //instance variable; we need to create object
	
	static String country="India";  //class variable are those with which we use static keyword. We don't need to create any object for it. It can be directly called by the class name
	
	
	public static void main(String[] args) {
		
		//System.out.println("Welcome To Tech Bodhi");

		//Date Types - widley used in selenium
		/* int age=30;
		char gender='M';
		boolean status=true;
		long pin=412207;
	    double marks=67.6788;
	
	    
	    // not used for selenium
	    byte small=10;
	    short val=100;
	    float fl=78.56f;
	    
	   String name="Rashmi";
	   
	   System.out.println(age);
	   System.out.println(gender);
	   System.out.println(status);
	   System.out.println(pin);
	   System.out.println(marks);
	   System.out.println(small);
	   System.out.println(val);
	   System.out.println(fl);
	   System.out.println(name); */
	   
	   
	   System.out.println(country);
	
	   
	Day1 obj=new Day1();
	
	System.out.println(obj.city);
	 
	   
	}
	

}
