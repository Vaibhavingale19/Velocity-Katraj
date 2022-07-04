package scrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
		//driver.manage().window().maximize();
		
		JavascriptExecutor j =((JavascriptExecutor)driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
		j.executeScript("window.scrollBy(90,1500)");

	}

}
