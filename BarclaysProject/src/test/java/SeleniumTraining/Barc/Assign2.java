package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Assign2 {
 
	WebDriver driver; 
	  @BeforeTest
	  public void beforeTest() {
			System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
			 driver=new ChromeDriver();
			driver.get("http://book.theautomatedtester.co.uk/chapter1");
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			 
	  }

  @Test
  public void f() {
	  String str=driver.findElement(By.xpath("//*[@id='secondajaxbutton']")).getAttribute("value");
	  System.out.println(str);
	  driver.findElement(By.xpath("//*[@id='secondajaxbutton']")).click();
	  
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
