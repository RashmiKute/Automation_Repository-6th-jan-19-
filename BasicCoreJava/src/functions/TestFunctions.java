package functions;

public class TestFunctions {

	public static void main(String[] args) {
		
		
AccessModifiers obj= new AccessModifiers();  //accessing a public method within a package
obj.publicMethod();
obj.noAccessModMethod();
obj.protectedMethod();
	}

}
