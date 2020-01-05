package xpath;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	
		static
	
		{
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromeDriver.exe");
			
			//System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
				
		}
		

		public static void main(String[] args) throws InterruptedException
		
		{
			
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gmail.com");
		driver.manage().window().maximize();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("enter user");
		String Un=sc.next();
		System.out.println("enter the password");
		String pw = sc.next();
		driver.findElement(By.cssSelector("input[type='email']")).sendKeys(Un);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(pw);
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("span[class='RveJvd snByac']")).click();
		Thread.sleep(3000);
		driver.close();
		
		
	
		}
}