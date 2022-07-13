package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class iframe1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.switchTo().frame("iframe-name");
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//a[text()='About us'])[1]")).click();
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("(//input[@name='radio'])[1]")).click();

	}

}
