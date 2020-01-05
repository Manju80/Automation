package selectClassMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckListSortedorNot{

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("file:///C:/files/GetAllSelectedOptions.html");
		 WebElement hotel = driver.findElement(By.id("bhagini"));
		 Select sel = new Select(hotel);	
		 Thread.sleep(5000);
		 
	
//to create an object of ArrayList
		
	ArrayList<String> alltext = new ArrayList<String> ();
	
	//to get all the options 
	 List<WebElement> alloptions=sel.getOptions();
	 Thread.sleep(6000);
	 int count = alloptions.size();
	 System.out.println(count);
	 
	 for (WebElement options:alloptions)
	 {
		 
		String text=options.getText();
		alltext.add(text);
		Thread.sleep(6000);
		 
	 }
		
		
	 //to sort the elements in the arraylist
	 Collections.sort(alltext);
	 Thread.sleep(6000);
	 //to print the options
	 
	 for(String text:alltext)
	 {
		 
		 System.out.println(text);
	 }
	 
	 
	 ArrayList<String> alltextcopy = new ArrayList<String>();
	 Collections.sort(alltextcopy);
	 if(alltextcopy==alltext)
	 {
		 
		 System.out.println("sorted");
	 }
	 
	 else
		 
	 {
		 
		 System.out.println("Not sorted");
	 }
		
 driver.close();	
	}
	
}


