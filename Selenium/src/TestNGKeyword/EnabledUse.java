package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class EnabledUse {
	
	//Enable use to commment method/Use to hide method using boolean condition false=hide , true=show
	  @Test()
	  public void E()
	  {
		  Reporter.log("metod E is running", true);
	  }
	  @Test()
	  public void D()
	  {
		  Reporter.log("metod D is running", true);
	  }
	  @Test(enabled = true)
	  public void B()
	  {
		  Reporter.log("metod B is running", true);
	  }
	  @Test()
	  public void A()
	  {
		  Reporter.log("metod A is running", true);
	  }
	  @Test(enabled = false)
	  public void C()
	  {
		  Reporter.log("metod C is running", true);
	  }
}
