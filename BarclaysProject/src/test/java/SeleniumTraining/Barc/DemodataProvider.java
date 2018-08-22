package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class DemodataProvider {
  @Test(dataProvider = "login")
  public void login(String username, String password) {
	  System.out.println("username is :"+username);
	  System.out.println("password is :"+password);
  }

  @DataProvider(name="login")
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "mercury", "mercury" },
      new Object[] { "selenium", "basic" },
      new Object[] { "asdbabd", "dsjdn" },
    };
  }
}
