package actionsClassMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class DragAndDropAction {

	static
	{
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		Thread.sleep(5000);
		 WebElement src = driver.findElement(By.id("draggable"));
		 WebElement dest = driver.findElement(By.id("droppable"));
		 Actions act=new Actions(driver);
		 
	act.dragAndDrop(src, dest).build().perform();
	Thread.sleep(2000);
	driver.close();

	}

}
