package webElementMethods;
import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class ActitimeFieldSize_UNPWD {

	private static Dimension size;

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://demo.actitime.2222com/login.do");
		Thread.sleep(3000);
		WebElement UN = driver.findElement(By.id("username"));
		//to get the size of Username element
		
		 System.out.println(UN.getSize());
		 
		 int h1 = (int) size.getHeight();

		 System.out.println(h1);
		 
		 int w1 = (int) size.getWidth();
		 System.out.println(w1);
		 
			//to get the size of password element
		 WebElement PWD = driver.findElement(By.name("pwd"));
		 System.out.println(PWD.getSize());
		 
		 int h2 = (int) size.getHeight();
		 System.out.println(h2);
		 int w2=(int) size.getWidth();
		 System.out.println(w2);
		 
		 if (h1==h2 && w1==w2)
			 
		 {
			 
			 System.out.println("Both are same");
		 }
		 
		 else 
			 
		 {
			 System.out.println("Both are not same");
		 }
		 driver.close();
	 }

	}


