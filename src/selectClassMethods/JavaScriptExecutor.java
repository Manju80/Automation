package selectClassMethods;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class JavaScriptExecutor {
	
	static
	
	{
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	}

public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("file:///C:/files/JavaScriptExecutor.html");
String UserName ="document.getElementById('Un').value='Rakesh' " ;
JavascriptExecutor js= (JavascriptExecutor)driver;
Thread.sleep(5000);
js.executeScript(UserName);
if(UserName!= null)
{
	System.out.println("Username entered successfully");
	
}
String clear = "document.getElementById('Un').value=' ' " ;
Thread.sleep(5000);
js.executeScript(clear);
System.out.println("UserName text cleared successfully");
String click = "document.getElementById('fb').click()";
js.executeScript(click);
Thread.sleep(4000);
System.out.println("successfully clicked and navigated to facebook page");
driver.close();
	}

}


