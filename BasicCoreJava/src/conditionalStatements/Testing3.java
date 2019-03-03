package conditionalStatements;

public class Testing3 {

	public static void main(String[] args) 
	{
		
		int a=10;
		int b=9;
		int c=7;
		
		if(a>b){
			
			if(b>c)
			{
				System.out.println("a is greatest");
			}
			else if(a>c){
				System.out.println("a is greatest of all");
			}
		}

	}

}
