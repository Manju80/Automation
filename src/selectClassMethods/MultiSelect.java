package selectClassMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect{

		public static void main(String[] args) throws InterruptedException {
			
			
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("file:///C:/files/MultiSelect.html");
		 WebElement hotel = driver.findElement(By.id("bhagini"));
		 Thread.sleep(5000);
		 
		 //by using index
		 
		 Select sel=new Select(hotel);
		 sel.selectByIndex(1);
		 Thread.sleep(6000);
		 
		 //by using value
		 
		 sel.selectByValue("m");
		 Thread.sleep(6000);
		 
		 //by using visible text
		 sel.selectByVisibleText("Prowns");
		 Thread.sleep(5000);
		 
		 //by using deselectAll by index
		 sel.deselectAll();
		 Thread.sleep(6000);
		 
		 //by using deselect by index
		 //sel.deselectByIndex(1);
		 //Thread.sleep(6000);
		 
		 //by using deselectByValue
		 //sel.deselectByValue("m");
		 //Thread.sleep(6000);
		 
		 //by using deselectByVisibleText
		 
		 //sel.deselectByVisibleText("Prowns");
		 //Thread.sleep(6000);
		 driver.close();
	}

}
