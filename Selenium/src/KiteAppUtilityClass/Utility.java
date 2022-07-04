package KiteAppUtilityClass;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class Utility {
	
	public static String readdatafromexcel(int row, int cell) throws EncryptedDocumentException, IOException
	{
		File myFile = new File("D:\\Velocity\\Automation Testing\\POM with excel.xlsx");
		Sheet mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
		
		String myValue = mySheet.getRow(row).getCell(cell).getStringCellValue();
		return myValue;
	}
	public static void Screenshot(WebDriver driver) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String random= RandomString.make(2);
		File dest = new File("D:\\Velocity\\Automation Testing\\TestNG Screenshot\\Screenshot"+random+".png");
		FileHandler.copy(src, dest);
	}

}
