package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotation {
  @BeforeTest
  public void Login()
  {
	 Reporter.log("Login Sucessful",true);
  }
  @BeforeMethod
  public void test1()
  {
	  Reporter.log("Hiiii",true);
  }
  @AfterMethod
  public void test2()
  {
	  Reporter.log("Hello",true);
  }
  @Test
  public void valid_user_Name()
  {
	  Reporter.log("Valid User Name",true);
  }
  @Test
  public void valid_password()
  {
	  Reporter.log("Valid Password",true);
  }
  @AfterTest
  public void LogOut()
  {
	  Reporter.log("LogOut Sussesful",true);
  }
}
