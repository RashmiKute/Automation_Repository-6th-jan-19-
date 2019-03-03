package basicAnnoations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Module1
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Module");
	}
	
	@BeforeMethod                         //Pre-Condition
	public void beforeTesScript()
	{
		System.out.println("Before Test Script");
	}
	
	@AfterMethod                           //Post-Condition
	public void afterTesScript()
	{
		System.out.println("After Test Script");
	}
	
	@Test
	public void test1()
	{
		System.out.println("login test case");				
	}
	
	@Test
	
	public void test2()
	{
		System.out.println("logout test case");				
	}
	
}
