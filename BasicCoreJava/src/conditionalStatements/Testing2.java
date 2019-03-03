package conditionalStatements;

public class Testing2 {

	public static void main(String[] args) {
		
		int a=10;
		int b=20;
		int c=30;
		
		if(a>b){
			System.out.println("First if");
		}else if (a>c){
			System.out.println("Second if");
		} else{
			System.out.println("Fail");
		}

	}

}
