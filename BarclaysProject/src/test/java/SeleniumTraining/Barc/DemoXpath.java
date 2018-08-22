package SeleniumTraining.Barc;

import org.testng.annotations.Test;



import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class DemoXpath {
 
	WebDriver driver; 
  @BeforeTest
  public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		 driver.manage().window().maximize();
		 driver.findElement(By.linkText("REGISTER")).click();
		 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		 
  }

  @Test
  public void f() {
	 driver.findElement(By.xpath("//*[@name='firstName']")).sendKeys("prashant");
	 driver.findElement(By.xpath("//*[@name='lastName']")).sendKeys("saxena");
	 driver.findElement(By.xpath("//*[@name='phone']")).sendKeys("5555555555");
	 driver.findElement(By.xpath("//*[@id='userName']")).sendKeys("abc@accenture.com");;
	 driver.findElement(By.xpath("//*[@name='address1']")).sendKeys("wakad");;
	 driver.findElement(By.xpath("//*[@name='city']")).sendKeys("pune");
	 driver.findElement(By.xpath("//*[@name='state']")).sendKeys("MAHARASHTRA");
	 driver.findElement(By.xpath("//*[@name='postalCode']")).sendKeys("411057");
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 Select s=new Select(driver.findElement(By.xpath("//*[@name='country']")));
	 driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	 s.selectByVisibleText("INDIA");
	 driver.findElement(By.xpath("//*[@id='email']")).sendKeys("abc@accenture.com");
	 driver.findElement(By.xpath("//*[@name='password']")).sendKeys("12345");
	 driver.findElement(By.xpath("//*[@name='confirmPassword']")).sendKeys("12345");
	 driver.findElement(By.xpath("//*[@name='register']")).click();
	 System.out.println("registered");
	 
	 
//	  driver.getTitle();
//	  Assert.assertEquals(driver.getTitle(),"Welcome: Mercury Tours");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
