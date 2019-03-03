package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegistrationDetails {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("http://www.newtours.demoaut.com/");
		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.name("firstName")).sendKeys("Rashmi");
		dr.findElement(By.name("lastName")).sendKeys("Kute");
		dr.findElement(By.name("phone")).sendKeys("9158688088");
		dr.findElement(By.name("userName")).sendKeys("kute.rashmi18@gmail.com");
		dr.findElement(By.name("address1")).sendKeys("87, Bharat Nagar, JK Road, Indrapuri");
		dr.findElement(By.name("city")).sendKeys("Bhopal");
		dr.findElement(By.name("state")).sendKeys("MP");
		dr.findElement(By.name("postalCode")).sendKeys("462022");
		dr.findElement(By.name("country")).sendKeys("India");
		dr.findElement(By.name("email")).sendKeys("kute.rashmi18@gmail.com");
		dr.findElement(By.name("password")).sendKeys("87654321");
		dr.findElement(By.name("confirmPassword")).sendKeys("87654321");
		dr.findElement(By.name("register")).click();
		
		Thread.sleep(3000);
		dr.quit();
		
	}

}
