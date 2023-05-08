package TestCases;

import org.testng.annotations.Test;

import BaseClass_LS.baseClass_LS;
import POM_LS.CartPage;
import POM_LS.DashboardPage;
import POM_LS.LoginPage;
import POM_LS.RegisterPage;
import UtilityClass_LS.utilityClass_LS;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class MyCartTC_LS extends baseClass_LS
{
	DashboardPage dp;
	CartPage cp;
	RegisterPage rp;
	LoginPage lp;
	
   @BeforeClass
  public void LaunchingSite() throws InterruptedException
   {
	   LaunchBrowser();
	   dp=new DashboardPage(driver);
	   rp=new RegisterPage(driver);
	   lp=new LoginPage(driver);
	   cp=new CartPage(driver);
	   
	   
   }

  @BeforeMethod
  public void loginPage() throws EncryptedDocumentException, InterruptedException, IOException
  {
	  lp.enterUsername(utilityClass_LS.readFromExcel(7, 0));
	  utilityClass_LS.ImplicitWait(1000, driver);
	  lp.enterPass(utilityClass_LS.readFromExcel(8, 0));
	  utilityClass_LS.ImplicitWait(1000, driver);
	  lp.clickLogBtn();
	  utilityClass_LS.ImplicitWait(1000, driver);
	  dp.AddToCart();
	  utilityClass_LS.ImplicitWait(1000, driver);
	  dp.ClickViewBtn();
	  utilityClass_LS.ImplicitWait(2000, driver);
  }
  
    @Test
  public void validatingCartItem() throws EncryptedDocumentException, IOException
  {
    	
		Assert.assertEquals(utilityClass_LS.readFromExcel(9, 0),cp.actualProd(),"Product name not matching TC fails");
	  Reporter.log("validating product name");
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
