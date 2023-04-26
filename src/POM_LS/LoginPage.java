package POM_LS;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage
{
	@FindBy(xpath="//a[@class='text-reset']") private WebElement registerBtn;
	@FindBy(id="userEmail") private WebElement loginField;
	@FindBy(id="userPassword")private WebElement passField;
	@FindBy(id="login")private WebElement logBtn;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void registerLink() throws InterruptedException
	{
		registerBtn.click();
		Thread.sleep(500);
	}
	
	public void enterUsername(String username) throws InterruptedException
	{
		boolean isLoginFieldPresent = loginField.isDisplayed();
		if(isLoginFieldPresent)
		{
		 loginField.sendKeys(username);
		 System.out.println("Username Field is present");
		}
		
		else
		{
			Assert.fail("Username Field not present");
		}
		
	}
		 
	
	public void enterPass(String pass)
	{
		passField.sendKeys(pass);
	}
	
	public void clickLogBtn()
	{
		logBtn.click();
	}
	
	
	

}
