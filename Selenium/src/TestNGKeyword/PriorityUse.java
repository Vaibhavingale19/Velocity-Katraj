package TestNGKeyword;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class PriorityUse {
  @Test(priority = -4)
  public void E()
  {
	  Reporter.log("metod E is running", true);
  }
  @Test(priority = 0)
  public void D()
  {
	  Reporter.log("metod D is running", true);
  }
  @Test(priority = 1)
  public void B()
  {
	  Reporter.log("metod B is running", true);
  }
  @Test(priority = -3)
  public void A()
  {
	  Reporter.log("metod A is running", true);
  }
  @Test(priority = -2)
  public void C()
  {
	  Reporter.log("metod C is running", true);
  }
}
