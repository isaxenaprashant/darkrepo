package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class LoginMercury {
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
	  }
  @Test
  public void login() {
	  
	  driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
  }
 

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
