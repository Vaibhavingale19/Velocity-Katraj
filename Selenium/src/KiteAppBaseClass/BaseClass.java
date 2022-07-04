package KiteAppBaseClass;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class BaseClass {
	protected WebDriver driver;
	
	//browser setup
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Reporter.log("launching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}

}
