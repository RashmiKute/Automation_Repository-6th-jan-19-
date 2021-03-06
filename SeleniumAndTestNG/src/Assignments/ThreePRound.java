package Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ThreePRound {

	public static void main(String[] args) throws InterruptedException
	{
		
System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
ChromeDriver dr=new ChromeDriver();
dr.manage().window().maximize();
dr.get("http://www.newtours.demoaut.com/");

dr.findElement(By.name("userName")).sendKeys("mercury");
dr.findElement(By.name("password")).sendKeys("mercury");
dr.findElement(By.name("login")).click();

dr.findElement(By.xpath("//input[@value='roundtrip']")).click();
boolean b=dr.findElement(By.xpath("//input[@value='roundtrip']")).isSelected();
System.out.println(b);

WebElement ele=dr.findElement(By.xpath("//select[@name='passCount']"));
Select sel=new Select(ele);
sel.selectByVisibleText("3");
WebElement ele1=dr.findElement(By.xpath("//select[@name='fromPort']"));
Select sel1=new Select(ele1);
sel1.selectByVisibleText("Acapulco");
WebElement ele2=dr.findElement(By.xpath("//select[@name='fromMonth']"));
Select sel2=new Select(ele2);
sel2.selectByVisibleText("April");
WebElement ele3=dr.findElement(By.xpath("//select[@name='fromDay']"));
Select sel3=new Select(ele3);
sel3.selectByVisibleText("7");
WebElement ele4=dr.findElement(By.xpath("//select[@name='toPort']"));
Select sel4=new Select(ele4);
sel4.selectByVisibleText("Sydney");
WebElement ele5=dr.findElement(By.xpath("//select[@name='toMonth']"));
Select sel5=new Select(ele5);
sel5.selectByVisibleText("August");
WebElement ele6=dr.findElement(By.xpath("//select[@name='toDay']"));
Select sel6=new Select(ele6);
sel6.selectByVisibleText("15");
dr.findElement(By.xpath("//input[@value='Business']")).click();
WebElement ele7=dr.findElement(By.xpath("//select[@name='airline']"));
Select sel7=new Select(ele7);
sel7.selectByVisibleText("Unified Airlines");
dr.findElement(By.name("findFlights")).click();
Thread.sleep(3000);
dr.close();


		
	}

}
