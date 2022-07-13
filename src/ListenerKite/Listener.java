package ListenerKite;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;


public class Listener implements ITestListener {
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Take a ScreenShot",true);
		
	}
	@Override
		public void onTestSuccess(ITestResult result) 
	{

		Reporter.log("Test Passed Successful",true);
	}
	@Override
		public void onTestSkipped(ITestResult result) 
	{
		Reporter.log("This test is skipped",true);
		}
	}
