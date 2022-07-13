package Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://vctcpune.com/selenium/practice.html");
		//maximize,minimize 
		driver.manage().window().maximize();
		//Thread.sleep
		Thread.sleep(2000);
		driver.findElement(By.name("radio")).click();
		driver.findElement(By.id("autocomplete")).sendKeys("Good Morning");
		Thread.sleep(2000);
		driver.findElement(By.id("autocomplete")).clear();
		
		

	}

}
