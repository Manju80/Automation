package PageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	//Declaration of webelements
	@FindBy(id="username")
	private WebElement untb;
	
	@FindBy(name="pwd")
	private WebElement pwtb;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement logbtn;
	
	//Initialization of webelements
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public void enterUsername(String un)
	{
		untb.sendKeys(un);
		
	}
	
	public void enterpassword(String pwd)
	{
		
		pwtb.sendKeys(pwd);
	}
	
	public void clickLogin()
	{
		
		logbtn.click();
	}
}
