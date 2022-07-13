package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageKite 
{
@FindBy(xpath = "//input[@id='userid']") private WebElement UserID;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;
	
	
	public LoginPageKite (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId(String UserName)
	{
		UserID.sendKeys(UserName);
		
	}
	
	public void EnterPassword(String Password)
	{
		PWD.sendKeys(Password);
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}


}
