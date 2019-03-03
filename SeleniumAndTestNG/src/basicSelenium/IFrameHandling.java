package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameHandling {

	public static void main(String[] args) throws InterruptedException
	
	{

		System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		ChromeDriver dr= new ChromeDriver();
		dr.manage().window().maximize();		
        dr.get("https://paytm.com/");
        Thread.sleep(2000);
        dr.findElement(By.xpath("//div[contains(text(),'Log In')]")).click();
        
        Thread.sleep(2000);
        dr.switchTo().frame(0);
        Thread.sleep(2000);
        dr.findElement(By.xpath("//span[contains(text(),'Login/Signup with mobile number and password')]")).click();
        
        
        Thread.sleep(3000);
        dr.close();
        
        
	}

}
