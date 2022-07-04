package KiteAppTestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClass;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLoginPage;
import KiteAppPOMClasses.KitePinPage;
import KiteAppUtilityClass.Utility;

public class ValidateUserID extends BaseClass{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchbrowser()
	{
		openbrowser();
		login = new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home = new KiteHomePage(driver);
	}
	
	@BeforeMethod
	public void loginkiteapp() throws EncryptedDocumentException, IOException, InterruptedException
	{
		login.sendUserName(Utility.readdatafromexcel(0, 0));
		Reporter.log("Sending username",true);
		login.sendPassName(Utility.readdatafromexcel(0, 1));
		Reporter.log("Sending password",true);
		login.clickonLoginButton();
		Reporter.log("click on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(Utility.readdatafromexcel(0, 2));
		Reporter.log("Sending pin",true);
		pin.clickonContinueButton();
		Reporter.log("click on continue button",true);
	}
  @Test
  public void validateUserName() throws EncryptedDocumentException, IOException
  {
	   String actualUserName = home.getactualUserID();
	   String expectedUserName= Utility.readdatafromexcel(0, 0);
	   
	   Assert.assertEquals(actualUserName, expectedUserName, "UserName is not matching then TC is failed");
	   Reporter.log("UserName is matching then TC is passed",true);
	   Utility.Screenshot(driver);
	   Reporter.log("Take screenshot",true);
  }
  
  @AfterMethod
  public void logoutFromKiteapp() throws InterruptedException
  {
	  home.clickOnLogoutButton();
	  Reporter.log("click on logout button",true);
  }
  
  @AfterClass
  public void closebrowser()
  {
	  driver.close();
	  Reporter.log("close browser",true);
  }
}
