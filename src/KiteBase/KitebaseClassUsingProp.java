package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class KitebaseClassUsingProp {
	WebDriver driver;
	public void openBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(UtilityProp.getDataFromPropertyFile("URL"));
		Reporter.log("Lanching Browser",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}

}
