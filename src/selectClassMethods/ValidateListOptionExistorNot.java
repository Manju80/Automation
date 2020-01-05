//Selenium script to validate list box contains specific option or not

/* Author: Manjunatha Reddy
 * Design Date: 21/06/2019
 * Test Scenario: To validate listbox contains specific option or not
 * Execution Date: 21/06/2019
 */
package selectClassMethods;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ValidateListOptionExistorNot{
	
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
		
		ArrayList<String> a1= new ArrayList<> ();
		
		//to get all the options
		List<WebElement> alloptions =sel.getOptions();
		int a1size = alloptions.size();
		System.out.println(a1size);
		
		//to display all the options in the list
		
		for(WebElement option:alloptions)
			
		{
			String text =option.getText();
			System.out.println(text);	
			a1.add(text);
		}
		
		//To validate list contains specified option or not
		
		if(a1.contains("Fish"))
			
		{
			
			
			System.out.println("Option is present");
		}
		
		else 
			
		{
			System.out.println("Option is not present");
			
		}
		
		
		driver.close();	

	}

}
