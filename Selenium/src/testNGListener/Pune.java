package testNGListener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Pune {
  @Test
  public void Swargate() 
  {
	  Assert.fail();
	  Reporter.log("Swargate TC is running",true);
  }
  @Test
  public void Chakan()
  {
	  Reporter.log("Chakan TC is running",true);
  }
}
