package ListenerKite;

import java.io.File;

import java.io.IOException;
import java.time.Duration;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;


import PracticeKitePOM.UtilityProp1;

public class BaseListener {
	static WebDriver driver;
	public void openBrowser() throws IOException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");

//	  
//ChromeOptions opt= new ChromeOptions();
//opt.addArguments("--disable-notifications");
//opt.addArguments("incognito");
//
driver= new ChromeDriver();
driver.manage().window().maximize();
driver.get(UtilityProp1.getDataFromPropertyFile("URL"));

Reporter.log("Launching browser",true);
driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
}
	public void captureScreenshot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\s\\Myscreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}
}
