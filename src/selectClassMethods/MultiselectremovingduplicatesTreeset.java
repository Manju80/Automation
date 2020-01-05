package selectClassMethods;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiselectremovingduplicatesTreeset{
	
	static
	
	{
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");		
		
	}

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.get("file:///C:/files/MultiSelectWithoutDuplicates.html");
		WebElement hotel=driver.findElement(By.id("bhagini"));
		Thread.sleep(6000);
		Select sel= new Select(hotel);
		
		
		//To declare an object of TreeSet
		
		TreeSet<String> alltext=new TreeSet<String>();
		
		//to get all options
		List<WebElement>alloptions=sel.getOptions();
		
		for(WebElement options: alloptions)
			
			
		     {
			
			String text = options.getText();
			alltext.add(text);
		    
		     }
		     
		     for( String text:alltext)
		    	 
		     {
		    	 System.out.println(text);
		    	 
		     }
			
		
		driver.close();
		}
	}
	
/* Output
 * Prowns
 * Chicken
 * Fish
 * Mutton
 */

