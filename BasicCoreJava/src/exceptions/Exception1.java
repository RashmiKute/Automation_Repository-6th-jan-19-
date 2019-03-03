package exceptions;

public class Exception1 {

	public static void main(String[] args) {
		         
/*int a=10;
int b=0;                     //Arithmetic Exception

System.out.println(a/b);
System.out.println("Anand");
	
*/
		
		/*String[] str= new String[1];
		str[1]="Rashmi";    */                 //ArrayIndexOutOfBoundsException
		
		
		String a="Rashmi";
		System.out.println(a.charAt(7));   //StringIndexOutOfBoundsException
		
}
}