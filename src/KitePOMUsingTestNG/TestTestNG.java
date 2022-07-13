package KitePOMUsingTestNG;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestTestNG {
	WebDriver driver;
	Sheet mysheet;
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	
  @BeforeClass
  public void Login() throws EncryptedDocumentException, IOException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		 driver=new ChromeDriver();
		//get() method to put the url
		driver.get("https://kite.zerodha.com/");
		driver.manage().window().maximize();
		File myfile=new File("D:\\Excel Practice\\Test Excel.xlsx");
		mysheet=WorkbookFactory.create(myfile).getSheet("Sheet1");
		login= new KiteLoginPage(driver);
		pin = new KitePinPage(driver);
		home= new KiteHomePage(driver);
		}
		@BeforeMethod
		public void loginToKiteApp()
		{ 
			String UN = mysheet.getRow(4).getCell(0).getStringCellValue(); 
			String PWD = mysheet.getRow(4).getCell(1).getStringCellValue(); 
			String PIN = mysheet.getRow(4).getCell(2).getStringCellValue();
		login.sendUserName(UN);
		Reporter.log("sending username",true);
		login.sendPassword(PWD);
		Reporter.log("sending password",true);
		login.clickOnLoginButton();
		Reporter.log("clicking on login button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		pin.sendPin(PIN);
		Reporter.log("sending PIN",true);
		pin.clickOnContinueButton();
		Reporter.log("clicking on continue button",true);
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		}
		@Test
		public void validateUserName()
		{ String expectedUN = mysheet.getRow(4).getCell(0).getStringCellValue();
		String actualUN = home.getActualUserName();
		Reporter.log("Validating UserName",true);
		Assert.assertEquals(actualUN, expectedUN,"Actual and Expected UN are not matching TC failed");
		Reporter.log("Actual and Expected UN are matching TC PASSED",true);
		}
		@AfterMethod
		public void logoutFromKiteApp() throws InterruptedException
		{
		home.logOut();
		Reporter.log("logging out...",true);
		}
		@AfterClass
		public void closeBrowser() throws InterruptedException
		{
		Thread.sleep(2000);
		Reporter.log("Closing browser",true);
		driver.quit();
		}
  }
