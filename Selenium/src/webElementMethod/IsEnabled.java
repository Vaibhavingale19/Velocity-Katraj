package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.discoveryplus.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//h6[text()='Sign In'])[2]")).click();
		Thread.sleep(100);
		
		WebElement OtpButton = driver.findElement(By.xpath("//button[text()='Get OTP']"));
		
		if(OtpButton.isEnabled())
		{
			OtpButton.click();
		}
		else
		{
			driver.findElement(By.name("mobileNumber")).sendKeys("7030057822");
			
			if(OtpButton.isEnabled())
			{
				OtpButton.click();
			}
			else
			{
				System.out.println("Failed to enable button");
			}
		}
		
	}

}
