package TestCases;

import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.DashboardPage;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class DashPageTC_LS extends baseClass_LS
{
	LoginPage lp;
	RegisterPage rp;
	DashboardPage dp;
	
  @BeforeClass
  public void LaunchSite() throws InterruptedException
  {
	  LaunchBrowser();
	  lp=new LoginPage(driver);
	  rp=new RegisterPage(driver);
	  dp=new DashboardPage(driver);
   }
  
  @BeforeMethod
  public void LoginPage() throws EncryptedDocumentException, InterruptedException, IOException 
  {
	  lp.enterUsername(utilityClass_LS.readFromExcel(7, 0));
	  utilityClass_LS.ImplicitWait(1000, driver);
	  lp.enterPass(utilityClass_LS.readFromExcel(8, 0));
	  utilityClass_LS.ImplicitWait(1000, driver);
	  lp.clickLogBtn();
  }
  
  @Test
  public void validatingView() throws IOException, InterruptedException
  {
	  dp.ClickViewBtn();
	  utilityClass_LS.Screenshot(driver);
	  utilityClass_LS.ImplicitWait(500, driver);
	  Reporter.log("Clicking on view button", true);
  }
  
  @Test(priority=1)
  public void validatingAddToCart() throws InterruptedException, IOException
  {
	  
	  dp.AddToCart();
	  utilityClass_LS.ImplicitWait(1000, driver);
	  utilityClass_LS.Screenshot(driver);
	  Reporter.log("clicking on add to cart",true);
  }
  
  @Test(priority=2)
  public void validatingCartView() throws InterruptedException, IOException
  {
	  dp.cart();
	  utilityClass_LS.ImplicitWait(1000, driver);
	  utilityClass_LS.Screenshot(driver);
	  Reporter.log("clicking on cart button",true);
   }
  
  
  @AfterMethod
  public void signOut() 
  {
	  dp.signOut();
	  utilityClass_LS.ImplicitWait(1000, driver);
   }

  @AfterClass
  public void closingBrowser()
  {
	  driver.quit();
  }

}
