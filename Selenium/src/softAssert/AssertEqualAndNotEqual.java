package softAssert;

import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertEqualAndNotEqual {
  
	SoftAssert soft  = new SoftAssert();
	@Test
  public void method()
  {
	  String p="Pune";
	  String q="Pune";
	  String r="Mumbai";
	  
	  soft.assertEquals(p, r, "TC is failed while both are Not equal");
	  Reporter.log("TC is passed both are not equal",true);
	  
	  soft.assertEquals(p, q, "TC is passed while both are equal");
	  Reporter.log("TC is failed  both are equal",true);
	  
	  soft.assertAll();
  }
	@Test
	  public void method1()
	  {
		boolean a=true;
		
		soft.assertTrue(a, "A is Not true TC is failed");
		Reporter.log("A is true TC is passed", true);
		
		soft.assertAll();
	  }
	


}
