package alertInterfaceMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ConfirmationPopup {
	static
	
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
{
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/files/ConfirmationPopup.html");
		driver.findElement(By.xpath("//button[.='Tryit']")).click();
		Thread.sleep(2000);
		Alert alert = driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver, 10 /*timeout in seconds*/);
        if(wait.until(ExpectedConditions.alertIsPresent())==null)
        {
              System.out.println("Pop up not present");
        }
        else
        {
        System.out.println("Popup present");
        }
       Thread.sleep(2000);
      // alert.accept();
       alert.dismiss();
      WebElement sm = driver.findElement(By.id("demo"));
      if(sm.isDisplayed())
      {
    	  
    	  System.out.println("Confrimation message is displayed");
      }
      else
    	  
      {
    	  System.out.println("Confirmation is not displayed");
      }
      
    String Message = sm.getText();
    if(Message=="You pressed OK!")
    {
    	System.out.println("Valid confirmation message");
    }
    else
    {
    	System.out.println("Invalid message");
    }
       Thread.sleep(2000);
       driver.close();
	}
}	