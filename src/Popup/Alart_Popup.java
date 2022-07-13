package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alart_Popup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[text()='Click me!'])[1]")).click();
		Thread.sleep(3000);
		
		Alert alt = driver.switchTo().alert();
		
		System.out.println(alt.getText());
		
		Thread.sleep(3000);
		
		alt.accept();
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[text()='All Examples']")).click();

		System.out.println("this is my file");
	}

}
