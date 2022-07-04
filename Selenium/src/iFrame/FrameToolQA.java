package iFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameToolQA {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		//Switch main to frame1 to frame2
		driver.switchTo().frame("frame1");
		Thread.sleep(1000);
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(frame2);
		WebElement Text1 = driver.findElement(By.xpath("//p[text()='Child Iframe']"));
		System.out.println(Text1.getText());
		Thread.sleep(1000);
		
		//Switch frame2 to frame1
		driver.switchTo().parentFrame();
		WebElement Text2 = driver.findElement(By.xpath("//body[text()='Parent frame']"));
		System.out.println(Text2.getText());
		Thread.sleep(1000);
		
		//Switch frame2 to main
		driver.switchTo().defaultContent();
		WebElement Text3 = driver.findElement(By.xpath("//div[@id='framesWrapper']"));
		System.out.println(Text3.getText());
		
	}

}
