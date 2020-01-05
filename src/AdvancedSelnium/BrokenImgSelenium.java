package AdvancedSelnium;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenImgSelenium {

	public static void  main(String[] args) 
	{
		
		
		//WenDriverManager.chromedriver().setup();
		
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe")	;
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.MILLISECONDS);
	driver.get("file:///C:/Users/Admin/Documents/selenium%20docs/Screens/img.html");
	
	
	
	WebElement img = driver.findElement(By.id("i2"));
	String src=img.getAttribute("src");
	String imgname=img.getAttribute("value");
	System.out.println("img address" +src);
	System.out.println("Img name " +imgname);
	

	try
	{
		URL url=new URL(src);
		HttpURLConnection con=(HttpURLConnection) url.openConnection();
		int code=con.getResponseCode();
		
		if(code==200)
		{
			System.out.println("img is not broken");
		}
		
		else
			
		{
			
			System.out.println("img is broken1");
			
		}
	}
	catch(Exception e)
	{
		System.out.println("img is broken2");
	}
	driver.close();
	
	}
	
	
}