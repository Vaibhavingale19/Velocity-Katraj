package testNGListener;

import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(testNGListener.Listener.class)
public class MyTestClass {
  @Test
  public void myMethod() 
  {
	  Reporter.log("Hii Have a nice day",true);
  }
}
