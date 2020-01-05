//Selenium script to validate list box contains duplicate options or not

/* Author: Manjunatha Reddy
 * Design Date: 21/06/2019
 * Test Scenario: To validate listbox contains duplicates or not
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

public class ValidateListcontainsDuplicateOptions {
	
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
		
		//Declare Arraylist
		
		ArrayList<String> a1= new ArrayList<> ();
		
		//to get all the options
		List<WebElement> alloptions =sel.getOptions();
		int a1size = alloptions.size();
		System.out.println(a1size);
		
		//to display all the options
		
		for(WebElement option:alloptions)
			
		{
			String text =option.getText();
			System.out.println(text);	
			a1.add(text);
		}
		
		//to remove the duplicates
		
		HashSet<String> a1copy= new HashSet<>(a1);
		int a1copysize = a1copy.size();
		
		for(WebElement option:alloptions)
		{
			String text=option.getText();
			a1copy.add(text);
			
		}
		
		for(String text:a1copy)
		{
			
			System.out.println(text);
			
		}
		
		//To compare the size...to check the list has duplicates are not
		
		if(a1size==a1copysize)
		{
			
			System.out.println("There are no duplicates");
			
		}
		
		else
			
		{
			
			System.out.println("There are duplicates");
		}
		
		driver.close();	

	}

}
