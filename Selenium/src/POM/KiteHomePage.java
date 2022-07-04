package POM;

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
	public void validateUserID()
	{
	String actualUserID = id.getText();
	String expetctedUserID = "ELR321";
	if(actualUserID.equals(expetctedUserID))
	{
	System.out.println("User ID matching TC is Passed");
	}
	else {
	System.out.println("User ID not matching TC is Failed");
	}
	}
	
	public void clickOnLogoutButton() throws InterruptedException
	{
	id.click();
	Thread.sleep(1000);
	logOutButton.click();
	}

}
