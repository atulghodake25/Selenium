package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBoxT {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://vctcpune.com/selenium/practice.html");
		//maximize,minimize 
		driver.manage().window().maximize();
		//Thread.sleep
		Thread.sleep(2000);
		WebElement list = driver.findElement(By.id("dropdown-class-example"));

		Select s=new Select(list);
		s.selectByVisibleText("Option1");
		Thread.sleep(2000);
		s.selectByIndex(2);
		Thread.sleep(2000);
		s.selectByValue("option3");
		System.out.println("this is my first commit");
		
	
	}
	

}
