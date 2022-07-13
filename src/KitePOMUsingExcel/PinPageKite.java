package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPageKite 
{

@FindBy(xpath = "//input[@id='pin']") private WebElement Pin;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement ContinueButton;
	
	public PinPageKite(WebDriver driver)
	{
		
		PageFactory.initElements(driver, this);
	}
	
	public void EnterPin(String PinValue)
	{
		Pin.sendKeys(PinValue);
	}
	
	public void ClickOnContinue()
	{
		ContinueButton.click();
	}
	
	
	

}

