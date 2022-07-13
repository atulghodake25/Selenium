package TestNG;

import org.testng.annotations.Test;

public class TestNG_KeyWord {
  @Test(invocationCount=5)
  public void Atul() 
  {
	  System.out.println("Hi Atul");
  }
  @Test(priority=-2)
  public void Pooja() 
  {
	  System.out.println("Hi Pooja");
  }
  @Test(enabled=false)
  public void varsha() 
  {
	 System.out.println("Hi Varsha"); 
  }
  @Test(dependsOnMethods="Atul")
  public void Rohit() 
  {
	 System.out.println("Hi Rohit"); 
  }
  @Test
  public void Rohan() 
  {
	 System.out.println("Hi Rohan"); 
  }
}
