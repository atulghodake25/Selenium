package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage 
{
 @FindBy(xpath = "//input[@id='userid']") private WebElement UserID;
	
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD;
	
	@FindBy(xpath = "//button[@class='button-orange wide']") private WebElement LoginButton;
	
	
	public  LoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUserId()
	{
		UserID.sendKeys("ELR321");
		
	}
	
	public void EnterPassword()
	{
		PWD.sendKeys("Dhana1111");
	}
	
	public void ClickOnLoginButton()
	{
		LoginButton.click();
	}

}


