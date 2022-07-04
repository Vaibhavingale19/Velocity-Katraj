package testNGListener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import KiteAppBaseClass.BaseClassUsingProperties;

public class Listener implements ITestListener
{
	BaseClassUsingProperties base = new BaseClassUsingProperties();//Created object of base class
	@Override
    public void onTestFailure(ITestResult result)
    {
    	String TCname=result.getName();
    
    	try {
    		base.takeScreenshot(TCname);
    	}
    	catch(IOException e)
    	{
    		e.printStackTrace();
    	}
    }
	@Override
    public void onTestSuccess(ITestResult result)
    {
    	Reporter.log("TC is Success",true);
    	ITestListener.super.onTestSuccess(result);
    }
	@Override
    public void onTestSkipped(ITestResult result)
    {
    	Reporter.log("TC is skipped, Please check dependent TC",true);
    	ITestListener.super.onTestSkipped(result);
    }
}
