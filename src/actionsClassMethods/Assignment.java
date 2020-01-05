package actionsClassMethods;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		 driver.get("https://home.redbrickhealth.com/why-redbrick/");
			Thread.sleep(5000);
	String xp="//a[.='RedBrick Health']/../..//a[.='Solutions']";
	driver.findElement(By.xpath(xp));
	//to perform mousehover action

	Actions act=new Actions(driver);
	act.moveToElement(driver.findElement(By.xpath(xp))).perform();
	Thread.sleep(5000);
	act.moveToElement(driver.findElement(By.xpath("//a[.='Markets We Serve']"))).perform();
	driver.findElement(By.xpath("//a[.='Markets We Serve']")).click();
	Thread.sleep(3000);
	//Declare array and add elements to array
	//driver.findElements(By.id("menu-item-8464"));
	ArrayList<String> a1=new ArrayList<String>();
	a1.add("Problems We Solve");
	a1.add("Markets We Serve");
	a1.add("Capabilities");
	int count=a1.size();
	System.out.println(count);
	//List<WebElement> menus=driver.findElements(By.id("menu-item-8464"));
	
	//to display all the data
	for(int i=0;i<=count-1;i++)
	{
		
		String data=a1.get(i);
		System.out.println(data);
	}
	
	//to create an object of treeset and sort the data
	TreeSet<String> alltext=new TreeSet<String>(a1);
	for(String text:alltext)
	{
		alltext.add(text);
		System.out.println(text);
	}
	
	ArrayList<String>alltextcopy=new ArrayList<String>(a1);
	//Collections.sort(alltextcopy);
	if(alltext.equals(alltextcopy))
	{
		
		System.out.println("Not Sorted");
	}
	else
	{
		System.out.println("sorted");
	}
	}
	
}

	
		 
		 
		 
		

