package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class locators {

	public static void main(String[] args) throws InterruptedException 
	{
		

		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		
		//to enter url
		
		driver.get("files://C:/basiclocator.html");
		
		//by using id
		
		WebElement fbpage=driver.findElement(By.id("fb"));
		fbpage.click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//by using name
		
		driver.findElement(By.name("forgot")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//by using class name
		
		driver.findElement(By.className("abc")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//by using tagname
		
		driver.findElement(By.tagName("a")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//By using link text
		
		driver.findElement(By.linkText("forgot password")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		
		//By  using partial linktext
		
		driver.findElement(By.partialLinkText("Inbox[10]"));
		Thread.sleep(3000);
		driver.close();

	}

}
