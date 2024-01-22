package Automation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("Running test");
	  Assert.assertEquals("This is test","This is also test","Both are different");
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println(" Before running test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After running test")
  }

}
