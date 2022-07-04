package KiteWithExcel;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","D:\\Velocity\\Automation Testing\\Software\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		File myFile = new File("D:\\Velocity\\Automation Testing\\POM with excel.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		String userName = mySheet.getRow(0).getCell(0).getStringCellValue();
		String password = mySheet.getRow(0).getCell(1).getStringCellValue();
		String pin = mySheet.getRow(0).getCell(2).getStringCellValue();
		 
		KiteLoginPage login=new KiteLoginPage(driver);
		login.sendUserName(userName);
		login.sendPassName(password);
		login.clickonLoginButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KitePinPage pin1=new KitePinPage(driver);
		pin1.sendPin(pin);
		pin1.clickonContinueButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		
		KiteHomePage hp= new KiteHomePage(driver);
		hp.validateUserID(userName);
		hp.clickOnLogoutButton();
		

	}

}
