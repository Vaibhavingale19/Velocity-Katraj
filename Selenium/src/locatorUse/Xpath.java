package locatorUse;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://phptravels.org/");
		driver.manage().window().maximize();
		Thread.sleep(100);
		//Xpath for attribute
		driver.findElement(By.xpath("//button[@id='login']")).click();
		
		//Xpath for Text method
		driver.findElement(By.xpath("//a[text()='Create account']")).click();	
		
		//Xpath by contains
		driver.findElement(By.xpath("//a[contains(text(),'Portal Home' )]")).click();
		

	}

}
