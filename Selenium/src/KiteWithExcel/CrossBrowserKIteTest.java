package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserKIteTest {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	WebDriver driver;
	org.apache.poi.ss.usermodel.Sheet mySheet;
	

	@BeforeClass
	@Parameters("browser")
	public void LaunchBrowser(String browser) throws EncryptedDocumentException, IOException
	{
		if(browser.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\geckodriver.exe");
			driver=new FirefoxDriver();
			
		}
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching url",true);
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		login = new KiteLoginPage(driver);
		pin =new KitePinPage(driver);
		home = new KiteHomePage(driver);
		File myFile = new File("D:\\Velocity\\Automation Testing\\POM with excel.xlsx");
		mySheet=WorkbookFactory.create(myFile).getSheet("Sheet1");
	}
	
	@BeforeMethod
	public void KiteLoginPage()
	{
		login.sendUserName(mySheet.getRow(0).getCell(0).getStringCellValue());
		Reporter.log("Sending username",true);
		login.sendPassName(mySheet.getRow(0).getCell(1).getStringCellValue());
		Reporter.log("Sending password",true);
		login.clickonLoginButton();
		Reporter.log("click on Login Button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		pin.sendPin(mySheet.getRow(0).getCell(2).getStringCellValue());
		Reporter.log("Sending pin",true);
		pin.clickonContinueButton();
		Reporter.log("click on Continue Button",true);

	}
	
	
  @Test
  public void verifyKiteUserName()  
  {
	  //Expected UserName --> exceel
	  //Actual UserName
	 
	  String expectedUserID = mySheet.getRow(0).getCell(0).getStringCellValue();
	  
	  String actualUserID = home.getactualUserID();
	  Reporter.log("Validating user ID",true);
	  
	  Assert.assertEquals(expectedUserID, actualUserID, "Expected and Actual are not matching TC is failed");
	  Reporter.log("Expected userID and Actual userID are matching TC is passed",true);

  }
  
  @AfterMethod
  public void KiteLogOutPage() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("click On Logout Button",true);
	  Thread.sleep(1000);
  }
  @AfterClass
 public void CloseBrowser()
  {
	  driver.close();
	  Reporter.log("Closing Browser",true);
  }
}
