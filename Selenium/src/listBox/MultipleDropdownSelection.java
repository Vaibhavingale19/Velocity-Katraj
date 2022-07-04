package listBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class MultipleDropdownSelection {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	    driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		WebElement dropdownBox = driver.findElement(By.name("selenium_commands"));
		
		//1. Create object of select class
		Select s =new Select(dropdownBox);
		
		//2. Check isMulptiple
		boolean result = s.isMultiple();
		System.out.println("isMultiple result is "+result);
		
		//3. How to select all
		
		s.selectByIndex(0);
		Thread.sleep(1000);
		
		s.selectByIndex(1);
		Thread.sleep(1000);
		
		s.selectByIndex(2);
		Thread.sleep(1000);
		
		s.selectByIndex(3);
		Thread.sleep(1000);
		
		s.selectByIndex(4);
		Thread.sleep(1000);
		
		//4. How to Deselect All
		//s.deselectAll();//when we select all then use
		
		s.deselectByIndex(0);
		
		//First selected get text
		System.out.println(s.getFirstSelectedOption().getText());

		//Size method
		System.out.println(s.getAllSelectedOptions().size());
		
		//using for loop
		for(int i=0; i<=s.getAllSelectedOptions().size()-1;i++)
		{
			System.out.println(s.getAllSelectedOptions().get(i).getText());
		}
	}

}
