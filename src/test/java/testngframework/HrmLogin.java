package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class HrmLogin {
  @Test
  public void login()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(1000);
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();

  }
 

}
