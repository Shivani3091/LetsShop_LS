package BaseClass_LS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class baseClass_LS 
{
     protected WebDriver driver;
      public void LaunchBrowser() throws InterruptedException
      {
    	  System.setProperty("webdriver.chrome.driver","C:\\Program Files\\Java\\chromedriver.exe");
    	  ChromeOptions cp=new ChromeOptions();
    	  cp.addArguments("--remote-allow-origins=*");
    	  driver=new ChromeDriver(cp);
    	  driver.get("https://rahulshettyacademy.com/client");
    	  driver.manage().window().maximize();
    	  Thread.sleep(1000);
      }
	
	
	
	
}
