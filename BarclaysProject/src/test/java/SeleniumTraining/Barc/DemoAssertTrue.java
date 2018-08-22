package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoAssertTrue {
  
	 @Test
	  public void f2() {
		 String name="prashant";
		 System.out.println("test1 start");
		 Assert.assertTrue(name.contains("ras"), "string found");
		 System.out.println("test1 completed");
	  }

  @Test
  public void f() {
	  String name="selenium";
	  System.out.println("test2 start");
		 Assert.assertTrue(name.contains("basic"), "string not found");
		 System.out.println("test2 completed");
  }
  
  

}
