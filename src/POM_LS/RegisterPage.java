package POM_LS;

import static org.testng.Assert.fail;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class RegisterPage
{
	@FindBy(xpath="//input[@type='firstName']") private WebElement nameField;
	@FindBy(xpath="//input[@type='lastName']")private WebElement lastField;
	@FindBy(xpath="//input[@type='email']")private WebElement emailField;
	@FindBy(xpath="//input[@type='text']")private WebElement numField;
	@FindBy(xpath="//select[@formcontrolname='occupation']")private WebElement OccuDD;
	@FindBy(xpath="(//input[@type='radio'])[2]")private WebElement genderBtn;
	@FindBy(id="userPassword") private WebElement passField;
	@FindBy(id="confirmPassword")private WebElement confirmField;
	@FindBy(xpath="//input[@type='checkbox']")private WebElement checkBox;
	@FindBy(id="login")private WebElement regBtn;
	
	public RegisterPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
		
	}
	
	public void EnterName(String name) throws InterruptedException
	{
		nameField.sendKeys(name);
		Thread.sleep(1000);
		Reporter.log("Entering username" , true);
	}
	
	public void EnterLastName(String last) throws InterruptedException
	{
		lastField.sendKeys(last);
		Thread.sleep(1000);
		Reporter.log("Entering Last name", true);
	}
	
	public void EnterEmail(String email) throws InterruptedException
	{
		emailField.sendKeys(email);
		Thread.sleep(1000);
		Reporter.log("Entering Email",true);
	}
	
	public void EnterNumber(String number) throws InterruptedException
	{
		numField.sendKeys(number);
		Thread.sleep(1000);
		Reporter.log("Entering number",true);
	}
	
	public void Occupation() throws InterruptedException
	{
		OccuDD.click();
		Select s=new Select(OccuDD);
		s.selectByValue("3: Engineer");
		Reporter.log("Selecting occupation from drop down", true);
		Thread.sleep(1000);
	}
	
	public void gender() throws InterruptedException
	{
		genderBtn.click();
		Thread.sleep(1000);
		Reporter.log("Selecting Gender", true);
	}

	public void EnterPassword(String pass) throws InterruptedException
	{
		passField.sendKeys(pass);
		Thread.sleep(1000);
		Reporter.log("Entering Password", true);
	}
	
	public void confirmpass(String password) throws InterruptedException
	{
		confirmField.sendKeys(password);
		Thread.sleep(1000);
		Reporter.log("Confirming password",true);
	}
	
	public void ClickCheckBox() throws InterruptedException
	{
		if(checkBox.isSelected())
		{
			 System.out.println("checkbox is selected");
		}
		
		else
	{
		Assert.fail("Checkbox not selected");
		Reporter.log("Accepting age requirement");
	}
	}
	
	public void accountBtn() throws InterruptedException
	{
		regBtn.click();
		Thread.sleep(1000);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
