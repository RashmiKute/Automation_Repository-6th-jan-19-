package exceptions;

import java.util.Hashtable;

public class TryCatch {
	
	// Exception Handling

	public static void main(String[] args) 
	{
		try{
			//Arithmetic Exception
	 	int a=10;
			int b=0;
			System.out.println(a/b);
			
			//Null Pointer Exception
			
			Hashtable<String, String> table=new Hashtable<String, String>();
		//	table.put(null,"Nikhil");
		//	System.out.println(table.get(null));
			
			
			//StringIndexOutOfBoundException
			String Str="A";
			System.out.println(Str.charAt(1));
			Thread.sleep(5000);
		}
		
catch (Exception e) {
			
			System.out.println("Fail: Divedent is zero");
		}	
		/*catch(ArithmeticException e)
		{
			System.out.println("Fail : Divident is zero");
			
		}
		catch(NullPointerException e)
		{
			System.out.println("Passed null key in Hashtable");
			
		}	
		
		catch(RuntimeException e)
		{
			System.out.println("run time exception or unchecked exception");
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}	
		
		System.out.println("Rashmi");

	}
*/
}
}
