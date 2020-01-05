package webDriverMethods;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExplorerLaunch {

	public static void main(String[] args)
	
	{
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		
InternetExplorerDriver ie=new InternetExplorerDriver();

ie.close();

	}

}
