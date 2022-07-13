package KiteBase;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePOM.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;


public class ValidUserName extends Base {
	KiteHomePage home;
	KiteLoginPage login;
	KitePinPage pin;
	@BeforeClass
	public void launchBrowser()
	{
	openBrowser();
	login= new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(Utility.readDatafromExcel(4, 0));
	login.sendPassword(Utility.readDatafromExcel(4, 1));
	login.clickOnLoginButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	pin.sendPin(Utility.readDatafromExcel(4, 2));
	pin.clickOnContinueButton();
	driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), Utility.readDatafromExcel(4, 0),"Actual and Expected are not matching TC is failed");
	}
	@AfterMethod
	public void logOutFromKite() throws InterruptedException
	{
	home.logOut();
	}
	@AfterClass
	public void closeBrowser()
	{
	driver.close();
	}
}
