package KiteAppTestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteAppBaseClass.BaseClassUsingProperties;
import KiteAppPOMClasses.KiteHomePage;
import KiteAppPOMClasses.KiteLoginPage;
import KiteAppPOMClasses.KitePinPage;
import KiteAppUtilityClass.UtilityUsingPropertyFile;

public class KiteUNtestUsingProperty extends BaseClassUsingProperties{
	
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
	@BeforeClass
	public void launchBrowser() throws IOException
	{
		openbrowser(); 
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws IOException
	{
		login.sendUserName(UtilityUsingPropertyFile.readDataFromProperty("UN"));
		login.sendPassName(UtilityUsingPropertyFile.readDataFromProperty("PWD"));
		login.clickonLoginButton();
		
		pin.sendPin(UtilityUsingPropertyFile.readDataFromProperty("PIN"));
		pin.clickonContinueButton();
	}
  @Test
  public void ValidateUserName() throws IOException
  {
	  String actualUserID = home.getactualUserID();
	  String expectedUserID = UtilityUsingPropertyFile.readDataFromProperty("UN");
	  
	  Assert.assertEquals(actualUserID, expectedUserID,"Actual and Expected are not matching, TC is failed");
	  Reporter.log("Actual and Expected are matching, TC is passed",true);
	 // UtilityUsingPropertyFile.Screenshot(driver);
  }
  
  @AfterMethod
  public void logoutFromKite() throws InterruptedException
  {
	  home.clickOnLogoutButton();
  }
  
  @AfterClass
  public void closebrowser() throws InterruptedException
  {
	  Thread.sleep(1000);
	  driver.close();
  }
}
