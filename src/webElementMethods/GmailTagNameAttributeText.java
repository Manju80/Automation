package webElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailTagNameAttributeText {

public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
WebDriver driver= new FirefoxDriver();
driver.get("https://accounts.google.com");
Thread.sleep(3000);
WebElement link = driver.findElement(By.cssSelector("span[text(),'Create account']"));
String tag = link.getTagName();
System.out.println("Tagname is : " +tag);
String value = link.getAttribute("href");
System.out.println(value);
driver.findElement(By.xpath("//span[class='NlWrkb snByac']")).click();
Thread.sleep(3000);
driver.findElement(By.className("jO7h3c")).click();
Thread.sleep(3000);
WebElement link1 = driver.findElement(By.linkText("Sign in instead"));
System.out.println(link1);
Thread.sleep(3000);
String tag1 = link.getTagName();
System.out.println("Tagname is :" +tag1);
String value1 = link.getAttribute("href");
System.out.println(value1);
driver.close();	
	}

}
