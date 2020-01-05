package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipCartAutosuggest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		WebDriverWait wt= new WebDriverWait(driver,8);
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com");
		Thread.sleep(8000);
		driver.findElement(By.className("_2AkmmA _29YdH8")).click();
		Thread.sleep(6000);
		List<WebElement> as = driver.findElements(By.className("LM6RPg"));
		driver.findElement(By.xpath("//input[type='text']")).sendKeys("iphone");
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
