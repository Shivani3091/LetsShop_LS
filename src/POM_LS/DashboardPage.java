package POM_LS;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage
{
    @FindBy(xpath="(//button[text()=' View'])[1]/i") private WebElement viewBtn;
    @FindBy(xpath="(//a[@class='continue']")private WebElement contBtn;
    @FindBy(xpath="(//button[text()=' Add To Cart'])[1]/i") private WebElement cartBtn;
    @FindBy(xpath="(//button[@class='btn btn-custom'])[4]") private WebElement signOutBtn;
    @FindBy(xpath="(//button[@class='btn btn-custom'])[3]") private WebElement cartViewBtn;
    
    public DashboardPage(WebDriver driver)
    {
    	PageFactory.initElements(driver, this);
    }
	
    public void ClickViewBtn() throws InterruptedException
    {
    	viewBtn.click();
    	Thread.sleep(1000);
    }
    
    public void ContinueBtn() throws InterruptedException
    {
    	contBtn.click();
    	Thread.sleep(1000);
    }
    
    public void AddToCart() throws InterruptedException
    {
    	cartBtn.click();
    	Thread.sleep(1000);
    }
    
    public void cart() throws InterruptedException
    {
    	cartViewBtn.click();
    	Thread.sleep(500);
    }
	
    public void signOut()
    {
    	signOutBtn.click();
    }
	
	
}
