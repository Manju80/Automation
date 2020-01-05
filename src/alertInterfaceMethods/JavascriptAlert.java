package alertInterfaceMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JavascriptAlert {
	
	static
	{
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/files/JavaScriptAlert.html");
		driver.findElement(By.xpath("//button[.='Try it']")).click();
		Thread.sleep(5000);	
		Alert a= driver.switchTo().alert();
		WebDriverWait wait = new WebDriverWait(driver, 10 /*timeout in seconds*/);
        if(wait.until(ExpectedConditions.alertIsPresent())==null)
        {
              System.out.println("alert was not present");
        }
        else
        {
        System.out.println("alert was present");
        }
        String text = a.getText();
		System.out.println(text);
		if(!(text=="Iam an alert box!"))
		{
			
			System.out.println("Alert message is Invalid");
		}
		
		else
			
		{
			
			System.out.println("valid alert message");
		}
		a.accept();
		//a.dismiss();
		Thread.sleep(2000);
		driver.close();

	}

}

