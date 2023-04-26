package TestCases;

import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class LastnameTC_LS extends baseClass_LS 
{
	LoginPage lp;
	RegisterPage rp;
	
  @BeforeClass
  public void launchSite() throws InterruptedException
  {
	  LaunchBrowser();
	  lp=new LoginPage(driver);
	  rp=new RegisterPage(driver);
   }
  
  @BeforeMethod
  public void ClickOnRegister() throws InterruptedException 
  {
	  lp.registerLink();
	  utilityClass_LS.ImplicitWait(500, driver);
  }
  
  
   @Test
  public void validatingLastNameField() throws EncryptedDocumentException, InterruptedException, IOException
  {
	  
	  rp.EnterLastName(utilityClass_LS.readFromExcel(1, 0));
	  utilityClass_LS.Screenshot(driver);
	  utilityClass_LS.ImplicitWait(1000, driver);
  }
  
  
   @AfterClass
   public void closingBrowser()
    {
     driver.close();
    }

}
