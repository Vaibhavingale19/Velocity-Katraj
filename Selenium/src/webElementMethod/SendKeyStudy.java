package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeyStudy {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://phptravels.org/login");
		Thread.sleep(100);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("VaibhavIngale@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("9665447100");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		

	}

}
