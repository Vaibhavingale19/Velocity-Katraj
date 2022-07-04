package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest {
	  @Test
	  public void TC1() 
	  {
		  Reporter.log("TC1 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC2() 
	  {
		  Reporter.log("TC2 Regression is running", true);
	  }
	  @Test
	  public void TC3() 
	  {
		  Reporter.log("TC3 is running", true);
	  }
	  @Test
	  public void TC4() 
	  {
		  Reporter.log("TC4 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC5() 
	  {
		  Reporter.log("TC5 Regression is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC6() 
	  {
		  Reporter.log("TC6 Sanity is running", true);
	  }
	  @Test
	  public void TC7() 
	  {
		  Reporter.log("TC8 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC8() 
	  {
		  Reporter.log("TC8 Sanity is running", true);
	  }
}
