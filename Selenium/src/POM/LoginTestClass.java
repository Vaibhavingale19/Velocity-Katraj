package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTestClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		 
		KiteLoginPage p1=new KiteLoginPage(driver);
		p1.sendUserName();
		p1.sendPassName();
		p1.clickonLoginButton();
		
		KitePinPage k1=new KitePinPage(driver);
		k1.sendPin();
		k1.clickonContinueButton();
		
		KiteHomePage hp= new KiteHomePage(driver);
		hp.validateUserID();
		hp.clickOnLogoutButton();
		
	}

}
