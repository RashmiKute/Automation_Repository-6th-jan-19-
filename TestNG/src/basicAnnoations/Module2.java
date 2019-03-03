package basicAnnoations;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Module2
{
	@BeforeClass
	public void beforeModule()
	{
		System.out.println("Before Module2");
	}
	
	@AfterClass
	public void afterModule()
	{
		System.out.println("After Module2");
	}
	
	@BeforeMethod                         //Pre-Condition
	public void beforeTesScript()
	{
		System.out.println("Before Test Script2");
	}
	
	@AfterMethod                           //Post-Condition
	public void afterTesScript()
	{
		System.out.println("After Test Script2");
	}
	
	@Test
	public void test1()
	{
		System.out.println("login test case2");				
	}
	
	@Test
	
	public void test2()
	{
		System.out.println("logout test case2");				
	}
	
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Before Suite");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("After Suite");
	}
}
