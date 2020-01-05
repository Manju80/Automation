package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathByText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("file:///C:/files/TextXpath.html");
	driver.findElement(By.xpath("//div[.='Login']"));
	driver.findElement(By.xpath("//div[.='Java']"));

	/* //Using Xpath with text method to identify specific web element 
	having only text without any other attributes
	
	<div>Login</div>
	//div[text()='Login']
	 //div[.='Login']
	
	<td>Java</td>
	//td[text()='Java']
	 //td[.='Java']
		
	
	*/
}
}
