package ListenerKite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
@Listeners
public class ListenerTest 
{
	  @Test
	  public void TC1() 

	  {
		Reporter.log("TC1 Running",true);
	  }
	  @Test
	  public void TC2() 

	  {
		Reporter.log("TC2 Running",true);
	  }
	  @Test
	  public void TC3() 

	  {
		Assert.fail();
		Reporter.log("TC3 Running",true);
	  }
	  @Test(dependsOnMethods = "TC3")
	  public void TC4() 

	  {
		Reporter.log("TC4 Running",true);
	  }


}
