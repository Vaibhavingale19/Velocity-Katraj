package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(5000);
		
		//Total number of rows 
		List<WebElement> rows = driver.findElements(By.xpath("//tr"));
		int TotalNumOfRows = rows.size();
		System.out.println("Total number of rows "+TotalNumOfRows);
		for (WebElement r1:rows)
		{
			System.out.print(r1.getText()+" ");
			System.out.println();
		}
		//for one element
				WebElement text = driver.findElement(By.xpath("//table//th[text()='Course']"));
				System.out.println(text.getText());
				System.out.println("=====================");
				
				//Perticular row select
				List<WebElement> row = driver.findElements(By.xpath("//table//tr[7]"));
				
				for (WebElement r:row)
				{
					System.out.println(r.getText()+" ||");
					System.out.println("=====================");
				}
		//find header of table
		List<WebElement> tableHeader = driver.findElements(By.xpath("//table//th"));
		
		for (WebElement th:tableHeader)
		{
			System.out.print(th.getText()+" ||");
			
		}
		

	}

}
