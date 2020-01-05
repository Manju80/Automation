package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption{

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
		 sel.selectByIndex(0);
		 Thread.sleep(6000);
		 
		 //by using value
		 
		 sel.selectByValue("m");
		 Thread.sleep(6000);
		 
		 //by using visible text
		 sel.selectByVisibleText("Prowns");
		 Thread.sleep(5000);
		 
	WebElement firstselected = sel.getFirstSelectedOption();
	System.out.println(firstselected.getText());
	Thread.sleep(6000);
		 driver.close();
	}

}
