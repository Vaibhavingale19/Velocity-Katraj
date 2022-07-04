package KiteWithExcel;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FireFoxDriver {
	
	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://kite.zerodha.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
}
