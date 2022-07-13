package Webtable;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tableStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		
		
		driver.findElement(By.id("customers")).click();
		 List<WebElement> rows = driver.findElements(By.xpath("//table//tr"));
		int totalNumOfRows = rows.size();
		System.out.println("Total number of rows in table "+totalNumOfRows);
		//how to find no of columns in table
		List<WebElement> columns = driver.findElements(By.xpath("//table//tr[1]//th"));
		int totalNumOfColumns = columns.size();
		System.out.println("Total Number of columns are "+totalNumOfColumns);
		// how to read header
		for(WebElement header:columns)
		{
		System.out.print(header.getText()+" ");
		}
		// how to read all rows from table
		List<WebElement> allrowsData = driver.findElements(By.xpath("//table//tr"));
		 Iterator<WebElement> it = allrowsData.iterator();
		while(it.hasNext())
		{
		System.out.print(it.next().getText()+" ");
		System.out.println();
		}
		driver.close();
		
		

	}

}
