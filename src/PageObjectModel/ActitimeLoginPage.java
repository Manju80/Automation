package PageObjectModel;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLoginPage {

//Declaration
	
	@FindBy(xpath="//a")
	private List<WebElement> alllinks;

	//Initialization
	
	public ActitimeLoginPage( WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
		
	}

	//utilization
	
	public void getallLinks()
	{
		
		int count = alllinks.size();
		System.out.println(count);
		for(WebElement links:alllinks)
		{
			String text=links.getText();
			System.out.println(text);
		}
	}
}