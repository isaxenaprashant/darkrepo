package SeleniumTraining.Barc;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Assign3 {
 
	WebDriver driver; 
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://en.wikipedia.org/wiki/Main_Page");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}

	@Test(priority = 1)
  public void f() {
	  driver.findElement(By.id("searchInput")).sendKeys("Selenium (software)");
	  driver.findElement(By.id("searchButton")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  if(driver.findElement(By.xpath("//*[@id='p-personal']//li[4]")).isEnabled()) {
		  System.out.println("link enabled");
	  }
	  else {
		  System.out.println("link is disabled");
	  }
	  driver.findElement(By.xpath("//*[@id='p-personal']//li[4]")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), "Create account - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	  if (driver.getCurrentUrl().contains("wikipedia.org")) {
		System.out.println("internal link");
	}
	  else {
		  System.out.println("external link");
	  }
	  driver.navigate().back();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), "Selenium (software) - Wikipedia");
	  System.out.println(driver.getCurrentUrl());
	  if(driver.findElement(By.xpath("//*[@class='infobox vevent']//tr[10]//a")).isEnabled()) {
		  System.out.println("link enabled");
	  }
	  else {
		  System.out.println("link is disabled");
	  }
  }
  @Test(priority = 2)
  public void f2() {
	  driver.findElement(By.xpath("//*[@class='infobox vevent']//tr[10]//a")).click();
	  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	  Assert.assertEquals(driver.getTitle(), "Selenium - Web Browser Automation");
	  System.out.println(driver.getCurrentUrl());
	  if (driver.getCurrentUrl().contains("wikipedia.org")) {
			System.out.println("internal link");
		}
		  else {
			  System.out.println("external link");
		  }
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
