package functions;

public class AccessModifiers {

	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();   //accessing a public function within a class
		obj.publicMethod();
		obj.privateMethod();
		obj.noAccessModMethod();
		obj.protectedMethod();
		
	}

	
	public void publicMethod()
	{
		System.out.println("Public Method");
	}
	
	private void privateMethod()
	{
		System.out.println("Private Method");
		
	}
	
	void noAccessModMethod()
	{
		System.out.println("noAccessModMethod");
		
	}
	
	protected void protectedMethod()
	{
		System.out.println("protectedMethod");
	}
}
