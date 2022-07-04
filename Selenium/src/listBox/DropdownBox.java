package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		Thread.sleep(2000);
		
		//1.Identify list box to be handled and store it in reference variable
		WebElement day = driver.findElement(By.id("day"));
		
		//2.Create an object of Select class which will accept WebElement as argument
		Select s=new Select(day);
		
		//3.By using one of the select class methods we can select values form list box 
		//1.selectByVisibleText: selectByVisibleText(String arg0) 
		s.selectByVisibleText("6");
		Thread.sleep(1000);
		//2. selectByIndex: selectByIndex(int arg0) 
		s.selectByIndex(8);
		Thread.sleep(1000);
		//3. selectByValue: selectByValue(String arg0)
		s.selectByValue("11");
		Thread.sleep(1000);
		
		//By using for loop
		for(int i=0;i<=9;i++)
		{
			s.selectByIndex(9);
			Thread.sleep(1000);
		}
		


	}

}
