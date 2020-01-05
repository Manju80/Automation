//Selenium script to print all duplicate options text only

/* Author: Manjunatha Reddy
 * Design Date: 21/06/2019
 * Test Scenario: To print all duplicate options text
 * Execution Date: 21/06/2019
 */
package selectClassMethods;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintallDuplicateOptionsText{
	
	static
	
	{
		
		System.setProperty("Webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			
	}

	public static void main(String[] args) {
	
		
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/files/GetAllSelectedOptions.html");
		
		WebElement hotel= driver.findElement(By.id("bhagini"));
		Select sel = new Select(hotel);
		
		//To create List object reference
		
		ArrayList<String> a1= new ArrayList<String> ();
		
		//to get all the options
		List<WebElement> alloptions =sel.getOptions();
		
		int count=0;
		HashSet<String> duplicates=new HashSet<String>(a1);
		
		for(WebElement options:alloptions)
			
		{
			String text = options.getText();
			System.out.println(text);
			
			if (!duplicates.add(text))
				
			{
				System.out.println(text);
				
			}
						
		}
		
		driver.close();	

	}

}
