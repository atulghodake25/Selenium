package ListenerCrossBrowser;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import PracticeKitePOM.Base1;

public class TestListener1 extends BaseListenerCross implements ITestListener
{
	BaseListenerCross b=new BaseListenerCross();
	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}
	@Override
	public void onTestSuccess(ITestResult result) 
	{
		
	}
	@Override
	public void onTestFailure(ITestResult result) 
	{
		Reporter.log("Takes Screenshot"+result.getName(),true);
	
	String TCID = result.getName();
	
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\s\\Myscreenshot"+TCID+".png");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}
	@Override
	public void onStart(ITestContext context) 
	{
		
	}
	@Override
	public void onFinish(ITestContext context) 
	{
		
	}
 
}
