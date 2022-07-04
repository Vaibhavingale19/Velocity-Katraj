package miscllaneous;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
       // driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/drag_drop.html");
        
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
        
        WebElement src = driver.findElement(By.xpath("//a[text()=' 5000 ']"));
		
        WebElement dest = driver.findElement(By.id("amt8"));
        
        Actions act = new Actions(driver);
        //1st way
        //act.dragAndDrop(src, dest).perform();
        	
        //2nd way
        act.clickAndHold(src).moveToElement(dest).release().build().perform();

	}

}
