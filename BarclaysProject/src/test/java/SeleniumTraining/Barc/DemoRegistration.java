package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoRegistration {
	WebDriver driver ;
  
  @BeforeTest
  public void beforeTest() {
	  driver = new FirefoxDriver() ;
	  driver.manage().window().maximize();
	  driver.get("http://book.theautomatedtester.co.uk/chapter1");
	  driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }

  @Test
  public void f() {
	 if(driver.findElement(By.xpath("//*[@name='selected(1234)']")).isSelected()) {
		 System.out.println("selected");
	 }
	 else {
	  driver.findElement(By.xpath("//*[@name='selected(1234)']")).click();
	  System.out.println("now selected");
	 }
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
