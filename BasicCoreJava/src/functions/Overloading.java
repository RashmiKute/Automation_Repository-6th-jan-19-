package functions;

public class Overloading {

	public static void main(String[] args) 
	{
			
		System.out.println(sum(10,20));	
		System.out.println(sum(10,20,30));
	}
	
public static int sum(int a,int b){
	return a+b;
	
}
public static int sum(int a,int b, int c){
	return a+b+c;
}
	

public static void message(String name,int age)  //it won't work by just swapping or changing the name of variable. Datatypes need to be changes or swapped
{

}
}