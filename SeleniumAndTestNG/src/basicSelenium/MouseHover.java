package basicSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {
public static void main(String[] args) throws InterruptedException 
	
	{

		System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();   //to maximize the screen
		dr.get("https://www.flipkart.com");
		
		//dr.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		
		dr.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		WebElement ele=dr.findElement(By.xpath("//span[text()='Women']"));
		Actions act=new Actions(dr);            //action class is used to drag drop and hover
       
		act.moveToElement(ele).build().perform();
		// Thread.sleep(2000);     //to make it wait for 2 seconds
		
		WebDriverWait wait= new WebDriverWait(dr,2);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[@title='Heels']"))));
		
		
		dr.findElement(By.xpath("//a[@title='Heels']")).click();
		Thread.sleep(3000);
	//	wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath(("//div[@class='_3aQU3C'])[1]")))));
		
		
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 50, 0).build().perform();
		Thread.sleep(3000);
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[2]")), -50, 0).build().perform();
		
		//span[contains(text(),'Appliances') and @class='_1QZ6fC _3Lgyp8']     //'contains' search in the whole string
		                                                                       //starts with' search only the starting part
		
		//a[text()='Sandals']/following::a[text()='Heels']    //      following
		//a[text()='Heels']/preceding::a[text()='Sandals']    //      preceding
		
		//a[text()='Sandals']/parent::li/following-sibling::li/a[text()='Heels']  //parent - child
		//a[text()='Sandals']/../following-sibling::li/a[text()='Heels']   //parent - child here we are using .. instead of mentioning the parent name it automatically catches its parent
		
		
		
}
}

	