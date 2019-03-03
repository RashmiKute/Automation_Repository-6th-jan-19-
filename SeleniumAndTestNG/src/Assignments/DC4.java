package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DC4 {

	public static void main(String[] args) throws InterruptedException
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://dc4ui.spsprod.in/dc4custmanager/faces/home.jsp");
		dr.findElement(By.name("ssousername")).sendKeys("rkute");
		dr.findElement(By.name("password")).sendKeys("dc4Rulz");
		dr.findElement(By.xpath("//input[@value='Login']")).click();
		
		Thread.sleep(3000);
		dr.close();
		
	}

}
