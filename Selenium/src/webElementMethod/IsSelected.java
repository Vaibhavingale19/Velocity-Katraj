package webElementMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		//Using is selected method
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		boolean result = male.isSelected();
		System.out.println(result);
		male.click();
		Thread.sleep(5000);
	}

}
