package ListenerKite;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import KiteBase.Base;

import KitePOM.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;

public class KiteProp1 extends Base1 {
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	String TCID="555";
	@BeforeClass
	public void launchBrowser() throws IOException
	{
	openBrowser();
	
	login= new KiteLoginPage(driver);
	pin= new KitePinPage(driver);
	home= new KiteHomePage(driver);
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(UtilityProp1.getDataFromPropertyFile("UN"));
	login.sendPassword(UtilityProp1.getDataFromPropertyFile("PASSW"));
	login.clickOnLoginButton();
	pin.sendPin(UtilityProp1.getDataFromPropertyFile("PIN1"));
	pin.clickOnContinueButton();
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), UtilityProp1.getDataFromPropertyFile("UN"));
	Base1.captureScreenshot(TCID);
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

