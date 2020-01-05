package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDeselectListdescendingOrder{

		public static void main(String[] args) throws InterruptedException {
			
			
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("file:///C:/files/GetAllSelectedOptions.html");
		 WebElement hotel = driver.findElement(By.id("bhagini"));
		 Thread.sleep(5000);
		 
Select sel = new Select(hotel);		 
 List<WebElement> alloptions=sel.getAllSelectedOptions();
 int count = alloptions.size();
 System.out.println(count);
		 
for (int i=0; i<count; i++)
	
{
	sel.selectByIndex(i);
	Thread.sleep(5000);
	
}

	
for(int i=count-1; i>=0; i--)
{

	sel.deselectByIndex(i);
	Thread.sleep(5000);
}

}
		
}