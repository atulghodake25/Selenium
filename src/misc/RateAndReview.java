package misc;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RateAndReview {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.name("q")).sendKeys("iphone12");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		
		// WebElement review1 = driver.findElement(By.xpath("((//div[@class='_2kHMtA'])[1]"));
		 
		
		    WebElement review = driver.findElement(By.xpath("((//div[@class='col col-7-12'])[1]//span)[6]"));
		
		    review.getSize();
		  System.out.println(review.getText());
//		for(WebElement ob:review)
//		{
//			System.out.println(ob.getText());
//		}
//	
		
		
		
		

	}

}
