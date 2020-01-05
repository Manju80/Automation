package alertInterfaceMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import PageObjectModel.LoginPage;

public class ActiTimeFileDownloadPopup {

static
{
	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
}

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(9, TimeUnit.SECONDS);
		driver.get("https://demo.actiTime.com/login.do");
		LoginPage lp = new LoginPage(driver);
		lp.enterUsername("admin");
		lp.enterpassword("manager");
		lp.clickLogin();
		Thread.sleep(10000);
		driver.findElement(By.id("container_tasks")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//div[@class='img'])[position()=2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[.='Delete']")).click();
		Thread.sleep(3000);
		//warning or confirmation pop up appears on clicking delete button
		Alert a= driver.switchTo().alert();
		//Using Alert interface reference switch to alert from default web page
		a.dismiss();
		//driver.findElement(By.xpath("//div[@class='cancelBtn greyButton']")).click();
		//click cancel button on the alert pop up
		Thread.sleep(3000);
		driver.close();
	}

}
