package miscllaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleElemntsUnordeLIst1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("latest android");
		Thread.sleep(1000);
		List<WebElement> searchResult = driver.findElements(By.xpath("((//ul[@class='G43f7e'])[1]/li)"));
		
		for(WebElement search:searchResult)
		{
			System.out.println(search.getText());
		}
		
		String expectedResult = "latest android version";
		
		for(WebElement result:searchResult)
		{
			System.out.println(result.getText());
			String actualResult = result.getText();
			

			if(actualResult.equals(expectedResult))
			{
				result.click();
				break;
			}
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		driver.findElement(By.linkText("Images")).click();
		
		driver.findElement(By.xpath("(//img[@class='rg_i Q4LuWd'])[1]")).click();
		

	}

}
