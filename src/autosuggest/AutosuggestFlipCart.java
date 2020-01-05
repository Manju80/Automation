package autosuggest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class AutosuggestFlipCart {


	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://www.flipkart.com/");
		 Thread.sleep(5000);
		 driver.findElement(By.className("//button[@class='_2AkmmA _29YdH8']")).click();
		 Thread.sleep(5000);
		driver.findElement(By.name("q")).sendKeys("iphone");
		List<WebElement> autosugg = driver.findElements(By.className("//input[@class='LM6RPg']"));
		Thread.sleep(5000);
		
		  int count = autosugg.size();
		  System.out.println(count);
		  
		  for (int i=0; i<count; i++)
			  
		  {
			 WebElement aut=autosugg.get(i);
			  String text = aut.getText();
			  System.out.println("text");
			    
		  }
		  
		 
		driver.close(); 
	}
	
	
}
