package AngelPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AngelBase 
{
	protected WebDriver driver;
	public void openBrowser() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	Thread.sleep(1000);

	}
}
