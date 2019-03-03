package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();   //to maximize the screen
		dr.get("http://www.newtours.demoaut.com/");
		
		dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);   // this will be used the handle the exception
		
//		dr.findElement(By.linkText("REGISTER")).click();
		dr.findElement(By.partialLinkText("ISTERsewfe")).click();
		

	}

}
