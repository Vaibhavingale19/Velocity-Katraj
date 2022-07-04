package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		
		Thread.sleep(1000);
		
		//switch main page to frame
		driver.switchTo().frame("iframe-name");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[text()='Courses'])[1]")).click();
		
		//Switch frame to main
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click();
		
		

	}

}
