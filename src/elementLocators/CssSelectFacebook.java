package elementLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CssSelectFacebook {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckdriver.exe");
		WebDriver driver = new FirefoxDriver();
  driver.get("www.facebook.com");
  driver.findElement(By.cssSelector("Input[class='inputtext']"));
  
  //To identify Email or phone web element using css selector
  driver.findElement(By.cssSelector("input[id='email']"));
		driver.findElement(By.cssSelector("input[type='email']"));
		driver.findElement(By.cssSelector("input[name='email']"));
		
		//to identify password element on webpage using cssSelector
		driver.findElement(By.cssSelector("input[id='pass']"));
		driver.findElement(By.cssSelector("input[name='pass']"));
		
		//to identify login button using cssSelector
		driver.findElement(By.cssSelector("input[type='submit']"));
		driver.findElement(By.cssSelector("input[value='Log In']"));
		driver.findElement(By.cssSelector("input[id='u_0_8]"));
		
		//to find first name field using cssSelector
		driver.findElement(By.cssSelector("input[id='u_0_j']"));
		
		//to identify surname element using cssSelector
		driver.findElement(By.cssSelector("input[id='u_0_1]"));
		driver.findElement(By.cssSelector("input[name='surname']"));
		
		//to identify Mobile number or email address element
		driver.findElement(By.cssSelector("input[id=u_0_o]"));
		
		//to identify New Password element using cssSelector
		driver.findElement(By.cssSelector("input[id='u_0_v']"));
		driver.findElement(By.cssSelector("input[autocomplete='new-password']"));
		
		//to identify date field using cssSelector
		
		// to identify Female radio button 
		driver.findElement(By.cssSelector("input[id='u_0_6']"));
		//to identify Male radio button
		driver.findElement(By.cssSelector("input[id='u_0_7']"));
		
		//to identify Sign Up button using cssSelector
		driver.findElement(By.cssSelector("button[id='u_0_11']"));
		
		//login to Facebook
		
		driver.findElement(By.cssSelector("input[id='u_0_j']")).sendKeys("manju.preva@gmail.com");
		driver.findElement(By.cssSelector("input[id='u_0_v']")).sendKeys("Chintamani!123#");
		driver.findElement(By.cssSelector("input[type='submit']")).click();
			
		
	}
	

}
