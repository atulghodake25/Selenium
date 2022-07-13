package ListenerCross;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import PracticeKitePOM.UtilityProp1;

public class BaseCross 
{

	static WebDriver driver;
	@Parameters("browser")
	    public void openBrowser(String name) throws IOException 
	    {
	    	if(name.equals("chrome"))
	    	{
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(UtilityProp1.getDataFromPropertyFile("URL"));

        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

         }else if(name.equals("firefox"))
	    	{
         

	
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Atul\\workspace-eclipse\\geckodriver-v0.31.0-win32\\geckodriver.exe");
         driver=new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get(UtilityProp1.getDataFromPropertyFile("URL"));

         Reporter.log("Launching browser",true);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	    	}
}
	public static void captureScreenshot(String TCID) throws IOException
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File("D:\\s\\Myscreenshot"+TCID+".png");
		FileHandler.copy(src, dest);
	}

}
