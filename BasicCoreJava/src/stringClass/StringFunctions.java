package stringClass;

public class StringFunctions {

	public static void main(String[] args) {
		
		//string function
		
		String name=" Rashmi ";
		String name2="rashmi";
		String name3="Rashmi Kute";
		String name4="Rashmi$Kute$TechBodhi$Pune";
		String name5="RashmiPratikKutePratikTechBodhiPratikPune";
		String name6="anand";
		
		System.out.println(name.length());  //when we add spaces before and after it will count the length as 8 ie it includes the spaces.
		
		//1. length
		int l=name.length();
		
		System.out.println(l);
		
		
		//2. charAt
		char c=name.charAt(0);
		System.out.println(c);
		
		//3. Equals
		System.out.println(name.equals(name2));
		
		//4. equalsignorecase
		System.out.println(name.equalsIgnoreCase(name2));
		
		//5. Trim
		System.out.println(name.trim());  // it removes the extra spaces.
		
		//6. Substring
		System.out.println(name3.substring(7));    /// it returns surname as we have mentioned from where to print 
		System.out.println(name3.substring(0,6));   /// it takes from where to start index and till where it do not include the 6th index

	   //7. Replace
		System.out.println(name.replace('a','c'));  // replace a character using an old value and new value
	    System.out.println(name4.replace("$", " "));
	 //   System.out.println(name5.replace("Pratik", "Nikhil")); 
	    
	   //8. Split
	    String[] str=name5.split("Pratik");
	    for(String s:str){
	    	System.out.println(s);
	    	
	    	
	    	
	    System.out.println((name6.length()-(name6.replace("n", "").length())));  ///to get to count of how many 'a' used in anand
	    	
	    		    
	    }
	}

}
