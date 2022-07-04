package testNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Annotation {
  @Test
  public void myMethod() 
  {
	  Reporter.log("First method is running", true);
  }
  @Test
  public void myMethod1()
  {
	  Reporter.log("Second method is running", true);
  }
  @BeforeClass
  public void launchURL()
  {
	  Reporter.log("Before launch method is running", true);
  }
  @BeforeMethod
  public void login()
  {
	  Reporter.log("Before login method is running", true);
  }
  @AfterMethod
  public void logout()
  {
	  Reporter.log("After logOut method is running", true);
  }
  @AfterClass
  public void close()
  {
	  Reporter.log("After browser close method is running", false);
  }
  
}
