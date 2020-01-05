package webDriverMethods;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UserInput {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the browser");
		String browser=sc.nextLine();
		sc.close();
		
		WebDriver driver=null;
		
		if (browser.equals("Firefox"))
		{
			
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.close();
			
		}
			else if (browser.equals("Chrome"))
				
			{
				System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
				
				driver=new ChromeDriver();
				driver.close();
				
			}
				
				
			
	}
			
}
