package FireFox;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;

import PracticeKitePOM.UtilityProp1;

public class Crossb {

	public static void main(String[] args) throws IOException 
	{
	
		
	   
	    
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(UtilityProp1.getDataFromPropertyFile("URL"));

        Reporter.log("Launching browser",true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

         
 
	
         System.setProperty("webdriver.gecko.driver", "C:\\Users\\Atul\\workspace-eclipse\\geckodriver-v0.31.0-win32\\geckodriver.exe");
         driver=new FirefoxDriver();
         driver.manage().window().maximize();
         driver.get(UtilityProp1.getDataFromPropertyFile("URL"));

         Reporter.log("Launching browser",true);
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));

}

	}


