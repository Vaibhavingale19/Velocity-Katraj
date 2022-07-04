package testNGAssertStudy;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertEqual {
  @Test
  public void test() {

	  String a="Sushant";
	  String b = "Sushant";
	  String c = "Kalyan";
	  
	  //if a & b are same then TC should be passed then Tc will be failed
//	  Assert.assertEquals(a, c);
//	  Reporter.log("String are matching TC is passed", true);
	  
	 Assert.assertNotEquals(a, b,"String are matching TC is failed");
	 Reporter.log("String are not matching TC is passed", true);
  }
}
