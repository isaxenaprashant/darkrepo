package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Registration {
  
	WebDriver driver;
	 @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.automationtesting.in/Register.html");
	  }

  @Test
  public void f() {
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']//div//div")).sendKeys("Prashant");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']//div//div[2]")).sendKeys("Saxena");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[2]/div")).sendKeys("mercury");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[3]/div/input")).sendKeys("prashant.b.saxena@accenture.com");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[4]/div/input")).sendKeys("1111111111");
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[5]/div/input")).click();
	  driver.findElement(By.xpath("//*[@id='basicBootstrapForm']/div[6]/div/div/input")).click();
  }
  @AfterTest
  public void afterTest() {
  }

}
