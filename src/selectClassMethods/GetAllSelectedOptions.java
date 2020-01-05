package selectClassMethods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllSelectedOptions{

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
		 
	List<WebElement> alloptions=sel.getAllSelectedOptions();
			int Count = alloptions.size();
	System.out.println(Count);
	
	for (WebElement alloption:alloptions)
	{
		
		System.out.println(alloption.getText());
	}
		 driver.close();
	}

}
