package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	//1.Data members/variables 
	 @FindBy (id = "userid") private WebElement UN;
	 @FindBy (id = "password") private WebElement PWD;
	 @FindBy (xpath = "//button[@type='submit']") private WebElement loginButton;
	
	 //2.Constructor
	 public KiteLoginPage(WebDriver driver)
	 {
		 PageFactory.initElements(driver, this);
	 }
	 
	 //3. method
	 public void sendUserName()
	 {
		 UN.sendKeys("ELR321");
	 }
	 public void sendPassName()
	 {
		 PWD.sendKeys("Dhana1111");
	 }
	 public void clickonLoginButton()
	 {
		 loginButton.click();
	 }
	 
}
