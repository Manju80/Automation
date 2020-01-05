package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllWebElementMethods {

	private static WebElement fname;

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("file:///C:/files/WebElementMethods.html");
		WebElement UN = driver.findElement(By.id("fn"));
		
		
	//Use SendKeys method
	UN.sendKeys("Manjunath");
	System.out.println("Text entered correctly");
		
	//Use clear method
	
	UN.clear();
	System.out.println("Cleared successfully");
	
	// Use click method
	
	WebElement btn=driver.findElement(By.id("log"));
	btn.click();
	System.out.println("login clicked successfully");
	driver.navigate().back();
	Thread.sleep(3000);
	
	//Use submit method
	
	WebElement btn1 = driver.findElement(By.id("log"));
	btn1.submit();
	Thread.sleep(3000);
	System.out.println("Successful submission");
	driver.navigate().back();
	Thread.sleep(3000);
	/* 
	//Use sendkeys method
	btn1.sendKeys(Keys.ENTER);
	Thread.sleep(3000);
	System.out.println("Submission success from keyboard enter key");
	driver.navigate().back();
	// Use sendKeys method to Copy data from firstname field and paste it to Lastname field
	WebElement fname = driver.findElement(By.id("fn"));
	
	//Copy date from firstname field
	fname.sendKeys("Ramesh");
	fname.sendKeys(Keys.CONTROL +"ac");
	System.out.println(fname);
	Thread.sleep(3000);
	
	//Paste data to lastname field using sendkeys
	WebElement lname = driver.findElement(By.id("ln"));
	lname.sendKeys(Keys.CONTROL +"v");
	System.out.println(lname);
	Thread.sleep(3000);
	
	//Sendkeys to delete the data in firstname field

	fname.sendKeys("Ramesh");
	fname.sendKeys(Keys.CONTROL +"a" , keys, "DELETE");
	System.out.println("Data deleted successfully");
	
	*/
	
	//to get the attribute name of the link
	
	WebElement link = driver.findElement(By.linkText("facebook"));
	//to get tagname
	
	String tag = link.getTagName();
	System.out.println(tag);
	
	//to get Attribute name
	String value = link.getAttribute("href");
	System.out.println(value);
	
	//to get text
	String text = link.getText();
	System.out.println(text);
	Thread.sleep(3000);
	
	//to get cssValue of the element
	WebElement fb=driver.findElement(By.xpath("//a[text()='facebook']"));
	fb.getCssValue("colour");
	System.out.println(fb);
	
	//to get cssValue based on font-size
	
	fb.getCssValue("font-size");
	System.out.println(fb);
	
	//to get cssValue based on font-style
	
	fb.getCssValue("font-style");
	System.out.println(fb);
	
	//to get cssValue based on text-decoration
	
	fb.getCssValue("text-decoration");
	System.out.println(fb);
	
	//isDisplayed
	
	System.out.println(fname.isDisplayed());
	if (fname.isDisplayed())
	{
		System.out.println("Element is displayed");
	}	
	else
		
	{
		System.out.println("Element is not displayed");
	}
	
	//isEnabled
	
	System.out.println(fname.isEnabled());
	if (fname.isEnabled())
	{
		System.out.println("Fname is enabled");
	}
	
	else
		
	{
		System.out.println("Fname is not enabled");
		
	}
	
	//isSelected
	
	WebElement cb = driver.findElement(By.id("Check"));
	
	System.out.println(cb);
	if (cb.isSelected())
	{
	 System.out.println("Checkbox selected");
	
	}
	
	else
	
	{
		
		System.out.println("Checkbox is not selected");
	}
	
	}
	
}
