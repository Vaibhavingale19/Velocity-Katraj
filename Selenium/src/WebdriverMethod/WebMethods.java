package WebdriverMethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//1. Using get method to launch url
		driver.get("https://www.swiggy.com/");
		
		//2. Using maximize method
		driver.manage().window().maximize();

		//3. Using navigate method
		driver.navigate().to("https://www.google.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().forward();
		Thread.sleep(1000);
		driver.navigate().refresh();
		Thread.sleep(1000);
		
		//4. Using getTitle method
		driver.get("https://www.swiggy.com/");
		Thread.sleep(1000);
		//System.out.println(driver.getTitle());
		String title = driver.getTitle();
		System.out.println("Title of swiggy is -->"+title);
		
		//5. Using getCurrentUrl
		driver.get("https://www.swiggy.com/");
		Thread.sleep(1000);
		String url = driver.getCurrentUrl();
		System.out.println("URL is --> "+url);
		
		//6. Using close
		driver.close();
	}

}
