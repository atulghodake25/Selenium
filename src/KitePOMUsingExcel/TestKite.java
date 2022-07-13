package KitePOMUsingExcel;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestKite {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
File Myfile = new File("D:\\\\Excel Practice\\\\Test Excel.xlsx");
		
		 Sheet Mysheet = WorkbookFactory.create(Myfile).getSheet("Sheet1");
		
		String Userid = Mysheet.getRow(4).getCell(0).getStringCellValue();
		String Password = Mysheet.getRow(4).getCell(1).getStringCellValue();
		double PinValue = Mysheet.getRow(4).getCell(2).getNumericCellValue();
		
		String PinValues=Double.toString(PinValue);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Atul\\workspace-eclipse\\chromedriver_win32\\Chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		//get() method to put the url
		driver.manage().window().maximize();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(2000);
		
		
		
 LoginPageKite login = new LoginPageKite(driver);
		
		login.EnterUserId(Userid);
		login.EnterPassword(Password);
		login.ClickOnLoginButton();
	
		Thread.sleep(2000);
		PinPageKite Login2= new PinPageKite(driver);
		Login2.EnterPin(PinValues);
		Login2.ClickOnContinue();
				
		Thread.sleep(2000);
		HomePageKite Home=new HomePageKite(driver);
		Home.UserIdValidation(Userid);
		
	}



	}


