package KiteBase;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KitePOM.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;

public class KiteProp extends Base {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	String TCID="555";
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
	login.sendUserName(UtilityProp.getDataFromPropertyFile("UN"));
	login.sendPassword(UtilityProp.getDataFromPropertyFile("PASSW"));
	login.clickOnLoginButton();
	pin.sendPin(UtilityProp.getDataFromPropertyFile("PIN"));
	pin.clickOnContinueButton();
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), UtilityProp.getDataFromPropertyFile("UN"));
	UtilityProp.captureScreenshot(driver, TCID);
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

