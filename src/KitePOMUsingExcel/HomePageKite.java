package KitePOMUsingExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageKite
{

@FindBy(xpath = "//span[@class='user-id']") private WebElement Userid;
	
	public HomePageKite(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	public void UserIdValidation(String UserName)
	{
		String ActualUserid = Userid.getText();
				
		String ExpecxtedUserid=UserName;
		
		if(ActualUserid.equals(ExpecxtedUserid))
			
		{
			System.out.println("TC passed user id is matching");
		}
		else {
			System.out.println("TC failed user id is not-matching");
			
		}
	}

}
