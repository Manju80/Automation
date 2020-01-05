package AdvancedSelnium;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alllinksbrokenverify {
	
	public static void main (String[] args) throws IOException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe")	;
		WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.MILLISECONDS);
	driver.get("https://www.seleniumhq.org/download/");
	List<WebElement> allinks = driver.findElements(By.tagName("a"));
	System.out.println("No of links present in the web page" +allinks.size());
	for (WebElement link : allinks)
	{
		String href=link.getAttribute("href");
		String text=link.getText();
		System.out.println(href);
		System.out.println(text);
		
		try
		{
			URL url=new URL(href);
			HttpURLConnection con=(HttpURLConnection) url.openConnection();
			int code=con.getResponseCode();
			
			if(code==200)
			{
				System.out.println("link is not broken");
			}
		}
		catch(Exception e)
		{
			System.out.println("Link is not broken");
		}
		driver.close();
		
	}
		
	}
}

