package ListenerCross;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import KitePOM.KiteHomePage;
import KitePOMUsingTestNG.KiteLoginPage;
import KitePOMUsingTestNG.KitePinPage;
import ListenerCrossBrowser.BaseListenerCross;
import ListenerCrossBrowser.UtilityListenerCross;

public class KiteCross extends BaseCross
{
	KiteLoginPage login;
	KitePinPage pin;
	KiteHomePage home;
	String TCID="555";
	
	
	@BeforeClass
	public void launchBrowser(String name) throws IOException
	{
		openBrowser(name);
		
		
		
		login= new KiteLoginPage(driver);
		pin= new KitePinPage(driver);
		home= new KiteHomePage(driver);
	
	
	
	}
	@BeforeMethod
	public void loginToKiteApp() throws EncryptedDocumentException, IOException
	{
	login.sendUserName(UtilityListenerCross.getDataFromPropertyFile("UN"));
	login.sendPassword(UtilityListenerCross.getDataFromPropertyFile("PASSW"));
	login.clickOnLoginButton();
	pin.sendPin(UtilityListenerCross.getDataFromPropertyFile("PIN1"));
	pin.clickOnContinueButton();
	}
	@Test
	public void validateUserID() throws EncryptedDocumentException, IOException
	{
	Assert.assertEquals(home.getActualUserName(), UtilityListenerCross.getDataFromPropertyFile("UN"));
	BaseListenerCross.captureScreenshot(TCID);
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



