package iFramesMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TwoFrames {

	
	static
	{
		
		System.setProperty("webdriver.gecko.driver","./Drivers/geckodriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= new FirefoxDriver();
		driver.get("file:///C:/files/page1.html");
		driver.findElement(By.id("m")).sendKeys("Binga");
		Thread.sleep(3000);
		
		driver.switchTo().frame("frame");//switch to parent frame using frame name
		Thread.sleep(3000);
		
		driver.findElement(By.id("gf1")).sendKeys("Minga");
		//Switch to child frame
		driver.switchTo().frame("frm");//Switch to child frame
		Thread.sleep(2000);
		
		driver.findElement(By.id("s")).sendKeys("Dinga");
		Thread.sleep(3000);
		
		driver.switchTo().parentFrame();//switch from child frame to parent frame
		Thread.sleep(2000);

		driver.findElement(By.id("k")).sendKeys("singa");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();//Switch from parent frame to default page
		driver.findElement(By.id("gf2")).sendKeys("ningi");
		Thread.sleep(2000);
		
		driver.close();
	}

}
