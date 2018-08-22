package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class googleDemo {
	WebDriver driver; 
	  @BeforeTest
	  public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("https://google.com");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
	  }

@Test
public void f() {
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Google");
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().to("https://www.seleniumhq.org/");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().back();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Google");
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().forward();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().refresh();
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	  System.out.println(driver.getTitle());
	  Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
	  System.out.println(driver.getCurrentUrl());
	  
}
@AfterTest
public void afterTest() {
	  driver.close();
}
}
