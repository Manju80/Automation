package selectClassMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElements {

	static
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers.geckodriver.exe");
		
	}
	
	public static void main(String[] args) 
	
	{
		
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/files/linksCount.html");
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		
		for(int i=0; i<=count-1; i++)
		{
				
			WebElement link = allLinks.get(i);
			String data = link.getText();
			System.out.println(data);
		
		}
		

	}
}
	

/*
 WebElement links = allLinks.get(0);
 System.out.println(links);
 ..............................................
 For each loop
 
  for (WebElement links : allLinks)
 {
     System.out.println(links);
 }
  ........................................................
 */

 

