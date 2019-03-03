package basicSelenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AlertHandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();   //to maximize the screen
		dr.get("file:///D:/BUSINESS%20DATA/Automation_Repository%20(6th%20jan%2019)/Practice.html");
		
		Select sel=new Select(dr.findElement(By.id("anand")));
		sel.selectByIndex(2);
		sel.selectByIndex(3);
		sel.selectByIndex(4);
		//sel.deselectByIndex(4);
		sel.deselectAll();
		
		JavascriptExecutor js= (JavascriptExecutor) dr;     //type casting
		WebElement ele=dr.findElement(By.tagName("button"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		ele.click();
		
		Alert al=dr.switchTo().alert();
		String str=al.getText();
		System.out.println(str);
		
		//al.accept();
		al.dismiss();
		
		
				
		

	}

}
