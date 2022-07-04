package Zerodha;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kite {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		WebElement UN = driver.findElement(By.id("userid"));
		WebElement PWD = driver.findElement(By.id("password"));
		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		
		UN.sendKeys("ELR321");
		PWD.sendKeys("Dhana1111");
		LoginButton.click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement pin = driver.findElement(By.id("pin"));
		WebElement Continue = driver.findElement(By.xpath("//button[@type='submit']"));
		
		pin.sendKeys("982278");
		Continue.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		WebElement UserId = driver.findElement(By.xpath("//span[@class='user-id']"));
		
		String actualUserId = UserId.getText();
		String expectedUserId = "ELR321";
		
		if(actualUserId.equals(expectedUserId))
		{
			System.out.println("User Id matching TC is passed");
		}
		else
		{
			System.out.println("User Id is not matched TC is failed");
		}
		UserId.click();
		Thread.sleep(1000);
		
		WebElement LogOutButton = driver.findElement(By.xpath("//a[@target='_self']"));
		LogOutButton.click();
		Thread.sleep(1000);
		driver.close();
			
	}

}
