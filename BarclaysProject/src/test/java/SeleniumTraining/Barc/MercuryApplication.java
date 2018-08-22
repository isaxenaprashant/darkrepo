package SeleniumTraining.Barc;

import org.testng.annotations.Test;

public class MercuryApplication {
  @Test
  public void OpenBrwoser() {
	  System.out.println("its OpenBrowser");
  }
  @Test(priority = 1 )
  public void f() {
	 System.out.println("its OpenBrowser");
  }
}

