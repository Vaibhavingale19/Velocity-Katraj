package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MyTest {
	  @Test()
	  public void E()
	  {
		  Reporter.log("metod E is running", true);
	  }
	  @Test(priority = -3 , enabled = false , timeOut = 1000 , dependsOnMethods = {"E"})
	  public void D()
	  {
		  Reporter.log("metod D is running", true);
	  }
	  @Test()
	  public void B()
	  {
		  Reporter.log("metod B is running", true);
	  }
	  @Test()
	  public void A()
	  {
		  Reporter.log("metod A is running", true);
	  }
	  @Test()
	  public void C()
	  {
		  Reporter.log("metod C is running", true);
	  }
}
