package KiteAppPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {


		//1. Data members or variables 
		@FindBy(xpath = "//span[@class='user-id']") private WebElement id;
		@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
		
		//2. Constructor
		public KiteHomePage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);

		}
		
		//3. Method
		
		public String getactualUserID()
		{
			String actualUserID = id.getText();
			return actualUserID;
		}
		public void validateUserID(String expectedUserName)
		{
		String actualUserID = id.getText();
		String expetctedUserID = expectedUserName;
		if(actualUserID.equals(expetctedUserID))
		{
		System.out.println("User ID matching TC is Passed");
		}
		System.out.println("User ID not matching TC is Failed");
		}
		
		
		public void clickOnLogoutButton() throws InterruptedException
		{
		id.click();
		Thread.sleep(1000);
		logOutButton.click();
		}

}
