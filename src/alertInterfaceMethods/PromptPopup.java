package alertInterfaceMethods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PromptPopup {

	static
	{
		System.setProperty("webdriver.geckodriver.exe", "./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) {
	 WebDriver driver = new FirefoxDriver();
	 driver.get("file:///C:/files/PromptPopup.html");
	 driver.findElement(By.id("p")).click();
	 Alert a=driver.switchTo().alert();
	 a.sendKeys("Manjunath Reddy");
	 a.accept();
	 String msg = a.getText();
	 System.out.println(msg);
	 if(msg=="Hello ! How are you today?")
	 {
		 System.out.println("valid prompt message");
	 }
	 else
	 {
		 System.out.println("Invalid prompt message");
	 }
	// a.dismiss();

	}

}
