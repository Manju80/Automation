package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IsSingleorMultiSelect{

		public static void main(String[] args) throws InterruptedException {
			
			
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		
		
		WebDriver driver= new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("file:///C:/files/MultiSelectWithoutDuplicates.html");
		 //driver.get(file:///C:/files/IsSingleOrMultiselect.html);
		 WebElement hotel = driver.findElement(By.id("bhagini"));
		 Thread.sleep(5000);
		 
		//is single select or multiselect
		 
		 Select sel=new Select(hotel);
		 
		 if (sel.isMultiple())
		 {
			 System.out.println("Multiselect");
			 
		 }
		 
		 else 
			 
		 {
			 System.out.println("Singleselect");
			 
		 }
		 
				 driver.close();
	}

}
