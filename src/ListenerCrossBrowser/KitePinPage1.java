package ListenerCrossBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage1 
{
	//1
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement continueButton;
	//2
	public KitePinPage1(WebDriver driver)
	{
	PageFactory.initElements(driver, this);
	}
	//3
	public void sendPin(String pin)
	{
	PIN.sendKeys(pin);
	}
	public void clickOnContinueButton()
	{
	continueButton.click();
	}


}
