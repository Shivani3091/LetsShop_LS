package TestCases;

import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.testng.annotations.AfterClass;

public class OccuTC_LS extends baseClass_LS
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
	  public void RegisterLink() throws InterruptedException
	{
		lp.registerLink();
		utilityClass_LS.ImplicitWait(500, driver);
	 }
	
  @Test
  public void validatingOccupationDD() throws InterruptedException, IOException
  {
	  rp.Occupation();
	  utilityClass_LS.Screenshot(driver);
	  utilityClass_LS.ImplicitWait(2000, driver);
  }
  
 @AfterClass
  public void closingBrowser()
  {
	  driver.close();
  }

}
