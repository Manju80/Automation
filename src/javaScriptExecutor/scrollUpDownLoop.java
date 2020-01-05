package javaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollUpDownLoop {

	static 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to scroll download
		
		for(int i=0; i<10; i++)
		{
		
		String scrollDown = "window.scrollBy(0,50)";
		js.executeScript(scrollDown);
		Thread.sleep(5000);
		}
		
		//to scroll up
		for(int i=0; i<10; i++)
		{
		String scrollUp = "window.scrollBy(0,-50)";
		js.executeScript(scrollUp);
		Thread.sleep(5000);
		driver.close();
		}
	}

	
}
