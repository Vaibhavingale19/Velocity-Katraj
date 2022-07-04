package KiteAppBaseClass;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;

import KiteAppUtilityClass.UtilityUsingPropertyFile;
import net.bytebuddy.utility.RandomString;

public class BaseClassUsingProperties {
	protected static WebDriver driver;
	
	//browser setup
	public void openbrowser() throws IOException
	{
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get(UtilityUsingPropertyFile.readDataFromProperty("URL"));
		Reporter.log("launching url",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(2000));
	}
	
		public void takeScreenshot(String TCname) throws IOException
		{
			File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			
			String random = RandomString.make(4);
			
			File Destination=new File("D:\\Velocity\\Automation Testing\\Screenshot"+random+".png");
			
			FileHandler.copy(Src, Destination);
		}
	
	
}
