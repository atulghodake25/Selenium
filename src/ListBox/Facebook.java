package ListBox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.facebook.com/");
		//maximize,minimize 
		driver.manage().window().maximize();
		//Thread.sleep
		Thread.sleep(2000);
		driver.findElement(By.linkText("Create New Account")).click();
		Thread.sleep(3000);
		driver.findElement(By.name("firstname")).sendKeys("Atul");
		Thread.sleep(2000);
		driver.findElement(By.name("lastname")).sendKeys("Ghodake");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_email__")).sendKeys("atul@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("reg_passwd__");
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(22);
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select s1=new Select(month);
		s1.deselectByVisibleText("Jan");
		Thread.sleep(2000);
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1960");
		Thread.sleep(2000);
		driver.findElement(By.name("sex")).click();
		Thread.sleep(2000);
		driver.findElement(By.name("websubmit")).click();

		


	}

}
