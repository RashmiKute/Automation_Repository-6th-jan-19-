package files.properties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ReadProperties {

	public static void main(String[] args){
		
	//	Thread.sleep(5000);  //(InterruptedException) //used to pause the code for sometime
		
	fun1();
	
		
	}
	
	public static void fun1() throws IOException{
		Properties or= new Properties();
		FileInputStream file=new FileInputStream("D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\BasicCoreJava\\src\\files\\properties\\ObjectRepository.propertiess");
		
	
	
		or.load(file);  //(IOException)
		
}
}
/*// throws IOException, InterruptedException  {
Properties or= new Properties();
FileInputStream file=new FileInputStream("D:\\BUSINESS DATA\\Automation_Repository (6th jan 19)\\BasicCoreJava\\src\\files\\properties\\ObjectRepository.propertiess");



or.load(file);  //(IOException)
	System.out.println(or.getProperty("url"));
		System.out.println(or.getProperty("password"));
		System.out.println(or.getProperty("username1"));
		*/
