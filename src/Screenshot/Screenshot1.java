package Screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		System.out.println(source);
		File dest=new File("D:\\IT\\fbimage.png");
		FileHandler.copy(source, dest);
	}
}
