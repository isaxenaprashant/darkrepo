package SeleniumTraining.Barc;

import org.testng.annotations.Test;

import com.thoughtworks.selenium.webdriven.commands.Click;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class AlertDemo {

	WebDriver driver; 
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "resources\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

	}
//	@Test
//	public void f1 {
//		driver.findElement(By.xpath("//*[@id='OKTab']//button")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().accept();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//
//
//	}
//	@Test
//	public void f2 {
//		driver.findElement(By.xpath("//*[@class='tabpane pullleft']//li[2]//a")).click();
//		driver.findElement(By.xpath("//*[@id='OKTab']//button")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().dismiss();
//		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
//	}
//
//	@Test
//	public void f3 {
//		driver.findElement(By.xpath("//*[@class='tabpane pullleft']//li[3]//a")).click();
//		driver.findElement(By.xpath("//*[@id='Textbox']//button")).click();
//
//		System.out.println(driver.switchTo().alert().getText());
//		driver.switchTo().alert().sendKeys("prashant");
//		driver.switchTo().alert().accept();
//	}



	@AfterTest
	public void afterTest() {
		driver.close();
	}

}
