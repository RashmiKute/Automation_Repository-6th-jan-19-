package testing;

import functions.AccessModifiers;

public class TestFunctions extends AccessModifiers {               // here we are adding extend so as to inherit AccessModifier and call protected modifier outside the package this at this package
	
	public static void main(String[] args) {
		
		AccessModifiers obj= new AccessModifiers();  //accessing a public method within a project
		
	obj.publicMethod();
	
	TestFunctions fun=new TestFunctions();
	fun.protectedMethod();
	
}

}
