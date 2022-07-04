package miscllaneous;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.findElement(By.name("q")).sendKeys("flipkart");
		List<WebElement> element = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
		
		for(WebElement ele:element)
		{
			System.out.println(ele.getText());
		}
		String expectedResult = "flipkart";
		for(WebElement result:element)
		{
			System.out.println(result.getText());
			String actualResult = result.getText();
			

			if(actualResult.equals(expectedResult))
			{
				result.click();
				break;
			}
		}
		
		System.out.println("==============================");
		
		driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("realme 9 pro");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		WebElement element1 = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[6]"));
		System.out.println(element1.getText());
		Thread.sleep(1000);
		WebElement element2 = driver.findElement(By.xpath("((//div[@class='gUuXy-'])[1]//span)[4]"));
		System.out.println(element2.getText());
	}
	
}
