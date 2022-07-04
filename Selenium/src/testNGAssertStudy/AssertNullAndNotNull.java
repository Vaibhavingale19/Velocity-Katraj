package testNGAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertNullAndNotNull {
  @Test
  public void method()
  {
	  String s = null;
	  String p = "Pankaj";
	  
//	  Assert.assertNotNull(s, "value is NotNull TC is failed");
//	  Reporter.log("Value is not null TC is passed",true);
	  
	  Assert.assertNull(p, "value is NotNull TC is failed");
	  Reporter.log("Value is null TC is passed",true);
  }
}
