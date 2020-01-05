package AdvancedSelnium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class brokenurlSelenium 
{
	
	public static void main (String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe")	;
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
	driver.get("C:\\Users\\Admin\\Documents\\test.html");
	WebElement link=driver.findElement(By.linkText("Qspiders"));
	String href=link.getAttribute("href");
	String text=link.getText();
	System.out.println("href" +href);
	System.out.println("link text "+text);
	try
	{
	URL url = new URL(href);
	HttpURLConnection con = (HttpURLConnection) url.openConnection();
	int code  = con.getResponseCode();
	if(code==200)
	{
		System.out.println("link is not broken");
	}
	else
	{
		System.out.println("link is broken");
		String msg = con.getResponseMessage();
		System.out.println(msg);
		
	}
	}
	catch (Exception e) 
	{
		System.out.println("link is broken2");
	}
	
	}
}