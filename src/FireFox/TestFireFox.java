package FireFox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFireFox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Atul\\workspace-eclipse\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("atul@gmail.com");

	}

}
