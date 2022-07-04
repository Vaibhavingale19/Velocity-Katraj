package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutsUse {
	  @Test()
	  public void E()
	  {
		  Reporter.log("metod E is running", true);
	  }
	  @Test(timeOut = 1000)
	  public void D() throws InterruptedException
	  {
		  Thread.sleep(900);
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
