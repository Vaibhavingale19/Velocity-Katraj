package waitorSynchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize(); 
		driver.get("https://www.discoveryplus.in/");
		
		WebDriverWait w =new WebDriverWait(driver,Duration.ofMillis(5000));
		WebElement signIn = driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]"));
		w.until(ExpectedConditions.visibilityOf(signIn));
		signIn.click();
	}

}
