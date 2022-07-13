package PracticeKitePOM;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Test;

import ListenerKite.BaseListener;

public class TestListener1 extends Base1 implements ITestListener
{
	Base1 b=new Base1();
	@Override
	public void onTestStart(ITestResult result) 
	{
		Reporter.log("Test Start",true);
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		Reporter.log("Test Sucessful",true);
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		
		System.out.println("Test Failed plz try again faild name is "+result.getName());
//	String TCIDName = result.getName();
//	try 
//	{
//		b.captureScreenshot(TCIDName);
//	}catch
//	{
//		e.printStackTrace();
//	}
	}
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}
	@Override
	public void onStart(ITestContext context) 
	{
		Reporter.log("on START",true);
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		Reporter.log("On FINISH",true);
	}
 
}
