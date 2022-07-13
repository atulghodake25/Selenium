package PracticeKitePOM;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Parameters;

public class Base1
{
	static  WebDriver driver;
	
			  
	
	driver.get(UtilityProp1.getDataFromPropertyFile("URL"));
	
	Reporter.log("Launching browser",true);
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	public static  void captureScreenshot( String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\s\\Myscreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
}
