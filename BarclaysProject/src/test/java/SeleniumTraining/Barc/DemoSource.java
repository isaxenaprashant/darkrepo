package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class DemoSource {
  //got to wiki-verify title-click on bio-verifytitle an printurl
	WebDriver driver;
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
  }
  
  @Test
  public void f() throws InterruptedException {
	  String t1=driver.getTitle();
	  System.out.println("first page:"+t1); 
	  
	  Assert.assertEquals(t1,"Wikipedia, the free encyclopedia");
	  driver.findElement(By.linkText("Biography")).click();;
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  
	  String t2=driver.getTitle();
	  System.out.println("title 2 :"+t2); 
	  Assert.assertEquals(t2,"Portal:Biography - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
