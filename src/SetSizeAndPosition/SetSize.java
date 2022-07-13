package SetSizeAndPosition;


import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://www.facebook.com/");
		System.out.println(driver.manage().window().getSize());
		Dimension d=new Dimension(200,200);
		driver.manage().window().setSize(d);
	}

}
