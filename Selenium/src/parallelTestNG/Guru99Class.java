package parallelTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Guru99Class {
	@Test
	  public void GoogleMethod() {
		  System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver.exe");
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.get("https://www.guru99.com/automation-testing.html");
		  Reporter.log("You are searching the automation-testing webpage", true);
}
}
