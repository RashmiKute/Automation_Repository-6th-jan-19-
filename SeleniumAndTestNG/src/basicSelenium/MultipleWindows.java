package basicSelenium;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindows {

	public static void main(String[] args) 
	{
	
	

			System.setProperty("webdriver.chrome.driver","D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\chromedriver.exe");
			
			ChromeDriver dr=new ChromeDriver();
			dr.manage().window().maximize();   //to maximize the screen
			dr.get("https://www.naukri.com/");
			
			//dr.close();     // to close the focussed window
			//dr.quit();        //closes all the windows
			
String parent=dr.getWindowHandle();
System.out.println(parent);

Set<String> winds= dr.getWindowHandles();

for(String s:winds){
	//System.out.println(s);
	dr.switchTo().window(s);
	if(!s.equals(parent)){
		dr.close();
	}
}
	}

}
