package Wait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		//Thread.sleep(10000);//100-->1900
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));//500
		driver.close();

	}

}
