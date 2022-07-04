package testNGAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertTrueFalse {
  @Test
  public void method()
  {
	  boolean a=true;
	  boolean b=false;
	  boolean c=true;
	  
//	  Assert.assertTrue(a, "A value is false TC is failed");
//	  Reporter.log("a Value is true TC is passed",true);
	  
	  Assert.assertFalse(b, "Value is true TC is failed");
	  Reporter.log("Value is false TC is passed",true);
  }
}
