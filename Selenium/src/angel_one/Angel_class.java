package angel_one;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Angel_class {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trade.angelbroking.com/Login");
		Thread.sleep(1000);
		
		WebElement userId = driver.findElement(By.id("txtUserID"));
		userId.sendKeys("V426000");
		
		WebElement Pass = driver.findElement(By.id("txtTradingPassword"));
		Pass.sendKeys("Vaibhav@3201");
		
		WebElement LoginButton = driver.findElement(By.id("loginBtn"));
		LoginButton.click();
		Thread.sleep(1000);
		
		WebElement Drop = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[10]"));
		Drop.click();
		
		WebElement LogOut = driver.findElement(By.id("ub_logout"));
		LogOut.click();
		
	}

}
