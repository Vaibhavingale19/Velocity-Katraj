package KiteAppUtilityClass;


import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;



import org.openqa.selenium.WebDriver;




public class UtilityUsingPropertyFile {
//	public static void Screenshot(WebDriver driver) throws IOException
//	{
//		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		String random= RandomString.make(4);
//		File dest = new File("D:\\Velocity\\Automation Testing\\TestNG Screenshot"+random+".png");
//		FileHandler.copy(src, dest);
//	}
	public static String readDataFromProperty(String key) throws IOException
	{
		Properties prop = new Properties();
		
		FileInputStream myprop = new FileInputStream("C:\\Users\\vaibh\\eclipse-workspace\\Selenium\\myProperty.properties");
		
		prop.load(myprop);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}
	public static void implicitWait(WebDriver driver,int timeUnit)
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(timeUnit));
	}
	

}
