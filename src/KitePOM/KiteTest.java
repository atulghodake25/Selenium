package KitePOM;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KiteTest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
	
		driver.manage().window().maximize();
		
		driver.get("https://kite.zerodha.com/");
		
		 LoginPage login = new LoginPage(driver);
		
		login.EnterUserId();
		login.EnterPassword();
		login.ClickOnLoginButton();
	
		
		 PinPage Login2 = new PinPage(driver);
		Login2.EnterPin();
		Login2.ClickOnContinue();
		Thread.sleep(1000);
		
		 KiteHomePage Home = new KiteHomePage(driver);
		Home.userIdValidation();
		
		Thread.sleep(3000);
		driver.close();
		
	}

	}


