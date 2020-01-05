package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		List<WebElement> as = driver.findElements(By.className("gLFyf gsfi"));
		Thread.sleep(8000);
		int count = as.size();
		System.out.println(count);
		
		for(int i=0; i<count; i++)
			
		{
			
			WebElement s = as.get(i);
			String text = s.getText();
			
			if (text.equals("qspiders banaswadi"))
				
			{
				s.click();
				
			}
			
			Thread.sleep(5000);
	driver.close();
			
			
		}
		
		
	

	}
	
	
}
