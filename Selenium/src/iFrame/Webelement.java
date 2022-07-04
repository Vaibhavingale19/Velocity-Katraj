package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelement {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		//Change selenium focus from main page to frame
		WebElement Element = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(Element);
		Thread.sleep(1000);
		//Click on click me to display Date and Time.
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
	

	}
	
}
