package testNG_Fail;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTestNG {
	 @Test
	  public void myMethod1() 
	  {
		  Reporter.log("First method is running", true);
	  }
	  @Test
	  public void myMethod2()
	  {
		  Assert.fail();
		  Reporter.log("Second method is running", true);
	  }
	  @Test
	  public void myMethod3() 
	  {
		  Reporter.log("Third method is running", true);
	  }
	  @Test
	  public void myMethod4()
	  {
		  Reporter.log("Fourth method is running", true);
	  }
}
