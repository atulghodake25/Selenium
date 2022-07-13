package KitePOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{

@FindBy(xpath = "//span[@class='user-id']") private WebElement Userid;
@FindBy(xpath = "//a[@target='_self']") private WebElement logOutButton;
	
	public KiteHomePage(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void userIdValidation()
	{
		String ActualUserid = Userid.getText();
				
		String ExpecxtedUserid="ELR321";
		
		if(ActualUserid.equals(ExpecxtedUserid))
			
		{
			System.out.println("TC passed user id is matching");
		}
		else {
			System.out.println("TC failed user id is not-matching");
			
		}
	}

	public String getActualUserName() {
		String actualUserName = Userid.getText();
		return actualUserName;
		
	}
	public void logOut() throws InterruptedException
	{
	Userid.click();
	Thread.sleep(200);
	logOutButton.click();
	}
}

