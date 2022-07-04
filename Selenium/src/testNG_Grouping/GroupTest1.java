package testNG_Grouping;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupTest1 {
	 @Test
	  public void TC9() 
	  {
		  Reporter.log("TC9 is running", true);
	  }
	  @Test(groups = "Regression")
	  public void TC10() 
	  {
		  Reporter.log("TC10 Regression is running", true);
	  }
	  @Test
	  public void TC11() 
	  {
		  Reporter.log("TC11 is running", true);
	  }
	  @Test(groups = "Sanity")
	  public void TC12() 
	  {
		  Reporter.log("TC12 Sanity is running", true);
	  }
}
