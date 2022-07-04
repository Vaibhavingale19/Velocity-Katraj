package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreeenShotStudy {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		
		/*To take screenshot using selenium webdriver, 
		we need to type cast driver object to Takes Screenshot interface.*/
		File Src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File Destination=new File("D:\\Velocity\\Automation Testing\\Screenshot\\ScreenShot1.png");
		
		FileHandler.copy(Src, Destination);
		
	}

}
