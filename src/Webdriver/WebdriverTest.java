package Webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://vctcpune.com/");
		//maximize,minimize 
		driver.manage().window().maximize();
		//Thread.sleep
		Thread.sleep(2000);
		driver.manage().window().minimize();
		
		//close() method- to close the current tab
		//driver.close();
		
		//quit() method-to close the all window
		//driver.findElement(By.xpath("//div[@style='display: flex; justify-content: center; align-items: center;  ']")).click();
		//driver.quit();
		
		//getTitle
		String title = driver.getTitle();
		System.out.println(title);

		//getcurrentURL
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}

}
