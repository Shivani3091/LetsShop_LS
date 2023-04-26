package TestCases;

import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.AfterClass;

public class LoginPageTC_LS extends baseClass_LS
{
	LoginPage lp;
	RegisterPage rp;
	
	
  @BeforeClass
  public void beforeClass() throws InterruptedException
  {
	  LaunchBrowser();
	  lp=new LoginPage(driver);
	  rp=new RegisterPage(driver);
   }
  
  @Test
  public void validatingUsernameField() throws EncryptedDocumentException, InterruptedException, IOException 
  {
	  
	 
	  lp.enterUsername(utilityClass_LS.readFromExcel(7, 0));
	  utilityClass_LS.ImplicitWait(500, driver);
   }
  
  @Test
  public void validatingPasswordField() throws EncryptedDocumentException, IOException
  {
	  lp.enterPass(utilityClass_LS.readFromExcel(8, 0));
	  utilityClass_LS.ImplicitWait(500, driver);
  }
  
  @Test
  public void validatingLoginButton()
  {
	  lp.clickLogBtn();
	  utilityClass_LS.ImplicitWait(1000, driver);
	  
  }
  
  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
