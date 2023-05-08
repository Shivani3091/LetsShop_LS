package POM_LS;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import UtilityClass_LS.utilityClass_LS;

public class CartPage
{
	@FindBy(xpath="//div/p[text()='#6262e95ae26b7e1a10e89bf0']") private WebElement OrderName;
	
	

	public CartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public String actualProd()
	{
		String expectName = OrderName.getText();
		
		Reporter.log("validating actual and expected product name",true);
		
		return expectName;
	}
	
	

}
