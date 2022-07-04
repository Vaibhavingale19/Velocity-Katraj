package testNGAssertStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification {
  @Test
  public void myTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://vctcpune.com/selenium/practice.html");
		//driver.manage().window().maximize();
		
		WebElement checkBox = driver.findElement(By.id("checkBoxOption1"));
		checkBox.click();
		Thread.sleep(1000);
		
		Assert.assertTrue(checkBox.isSelected(), "CheckBox is not selected TC is failed");
		Reporter.log("CheckBox is selected TC is passed", true);
  }
} 
