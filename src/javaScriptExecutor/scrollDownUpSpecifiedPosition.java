package javaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class scrollDownUpSpecifiedPosition {


	static 
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
	}
	
	public static void main(String[] args, int Y) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.seleniumhq.org/download/");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//to scroll download
		
		String xp="//td[.='Java']/..//a[.='Download']";
		WebElement link = driver.findElement(By.xpath(xp));
		
		String scrollDown = "window.scrollBy(0, '"+Y+"')";
		js.executeScript(scrollDown);
		Thread.sleep(8000);
		
		//to scroll up
		
		String scrollUp = "window.scrollBy(0,' "+(-Y)+" ')";
		js.executeScript(scrollUp);
		Thread.sleep(8000);
		driver.close();
		
	}

}
