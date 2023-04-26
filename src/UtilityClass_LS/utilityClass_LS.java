package UtilityClass_LS;


import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class utilityClass_LS 
{
	// Excel
	//Screenshot
	//ScrollIntoView
	// wait
	
	public static String readFromExcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myfile=new File("C:\\Users\\91942\\Documents\\Auto.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet7");
		String value = mysheet.getRow(row).getCell(cell).getStringCellValue();
		return value;
	}
	
	public static void ImplicitWait(int time, WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(time));
		
	}
	
	public static void Screenshot(WebDriver driver) throws IOException
	{
		
	         File scr = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	         File dest=new File("C:\\Users\\91942\\Documents\\Automation document\\screenshot.png");
	         FileHandler.copy(scr, dest);
	}
	
	public void ScrollIntoView(WebDriver driver, WebElement element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(element);
		act.perform();
	}

	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


