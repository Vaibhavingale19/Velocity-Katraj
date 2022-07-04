package scrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrollinto {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		Thread.sleep(100);
		WebElement HideShowButton = driver.findElement(By.id("hide-textbox"));
		
		JavascriptExecutor j = ((JavascriptExecutor)driver); 
		j.executeScript("arguments[0].scrollIntoView(true);",HideShowButton);
		Thread.sleep(100);
		HideShowButton.click();
	}

}
