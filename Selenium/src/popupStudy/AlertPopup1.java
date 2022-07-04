package popupStudy;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/alerts");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		//1.To handle alert popup we need to switch selenium focus from main page to alert popup by using syntax
				Alert alt = driver.switchTo().alert();
				Thread.sleep(1000);
				
				//2.Alert is an interface which contains abstract methods like
				System.out.println(alt.getText());
				alt.accept();
				
				driver.findElement(By.id("confirmButton")).click();	
				Thread.sleep(1000);
				Alert alt1 = driver.switchTo().alert();
				Thread.sleep(1000);
				System.out.println(alt1.getText());
				alt1.accept();
	}

}
