package TestCases;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

public class EmailTC_LS extends baseClass_LS 
{
	LoginPage Lp;
	RegisterPage Rp;
	
	@BeforeClass
	  public void launchbrowser() throws InterruptedException
	  {  
			
			LaunchBrowser();
			Lp=new LoginPage(driver);
			Rp=new RegisterPage(driver);
	  }
	
	@BeforeMethod
	  public void RegisterLink() throws InterruptedException
	  { 
		  Lp.registerLink();
		  utilityClass_LS.ImplicitWait(1000, driver);
	    }
	
	@Test
	  public void validatingEmailField() throws EncryptedDocumentException, InterruptedException, IOException
	  {
		  Rp.EnterEmail(utilityClass_LS.readFromExcel(2, 0));
		  utilityClass_LS.Screenshot(driver);
		  utilityClass_LS.ImplicitWait(500, driver);
	  }
	

	  @AfterClass
	  public void closingBrowser()
	  {
		  driver.close();
	  }
	
	
}
