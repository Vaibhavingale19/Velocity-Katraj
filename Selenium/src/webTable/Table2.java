package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/sql/sql_select.asp");
		Thread.sleep(5000);
		
		List<WebElement> NumOfRows = driver.findElements(By.xpath("//tr"));
		List<WebElement> NumOfColumns = driver.findElements(By.xpath("//th"));
		
		int TotalNumOfRows = NumOfRows.size();
		int TotalNumOfColumns = NumOfColumns.size();
		
		
		System.out.println("Total number of rows "+TotalNumOfRows);
		System.out.println("Total number of columns "+TotalNumOfColumns);
		
		for(int i=1; i<=TotalNumOfRows; i++)
		{
			for(int j=1; j<=TotalNumOfColumns; j++)
			{
				if(i==1)
				{
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//th["+j+"]")).getText();	
					System.out.print(text+" ||");
				}
				else {
					String text = driver.findElement(By.xpath("//table//tr["+i+"]//td["+j+"]")).getText();	
					System.out.print(text+" ||");
				}
		
			}
			System.out.println("  ");
		}
		

	}

}
