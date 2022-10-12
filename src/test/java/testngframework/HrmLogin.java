//TestNG is an automation testing framework in which NG stands for “Next Generation”. TestNG is inspired by JUnit which uses the annotations (@)

package testngframework;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HrmLogin {
  @Test
  public void login()
  {
  
  System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
  WebDriver driver = new ChromeDriver(); //Calling the webdriver
  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//adding the time delay
  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Opening the application in chrome
	//Thread.sleep(1000);
  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Entering the username
  driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"); //Entering the password
  driver.findElement(By.xpath("//button[@type='submit']")).click(); //Clicking on the submit button

  }
 

}
