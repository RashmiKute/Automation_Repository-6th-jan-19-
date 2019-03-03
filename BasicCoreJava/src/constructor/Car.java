package constructor;

public class Car {

	String name;
	int speed;
	String manufacturer;
	static int wheels=4;
	
	public Car(String name, int speed, String manufacturer)   //Default constructor //Here were are overriding our default constructor with the parameters. So whenever we will create a object we will always require values of the parameters
	{
		this.name=name;                                     //this is used to point to the instance variable instead of local variable
		this.speed=speed;
		this.manufacturer=manufacturer;
	}
	
	public Car()
	{
		
	}
	
	public void drive(){
		
		System.out.println("Drive "+manufacturer+" "+name+" car at the speed of "+speed+"");
		
	}
	public void accelerate()
	{
		System.out.println("Accelerate "+manufacturer+" "+name+" car with "+wheels+" wheels");
	}
	
	

}
