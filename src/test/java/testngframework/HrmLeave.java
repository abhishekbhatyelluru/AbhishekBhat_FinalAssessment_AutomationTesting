//TestNG is an automation testing framework in which NG stands for “Next Generation”. TestNG is inspired by JUnit which uses the annotations (@)

package testngframework;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class HrmLeave {
  @Test
  public void Leave() throws InterruptedException 
  {
	    System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); ////Calling the webdriver
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Adding the delay
	    
	    //Login Function
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Opening the application in chrome
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Entering the username
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"); //Entering the password
	    driver.findElement(By.xpath("//button[@type='submit']")).click(); //Clicking on the submit button
	    
	    //Leave Function
	    driver.findElement(By.linkText("Leave")).click(); //Clicking on the leave in dashboard
	    driver.findElement(By.linkText("Apply")).click(); //Click on the apply inside the leave function
	    driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click(); //click
	    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click(); //Entering the fields
	    driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");  //Entering the fields
	    driver.findElement(By.xpath("//textarea")).sendKeys("work from home");  //Entering the fields
	    Thread.sleep(1000); //Adding the thread dealy
	    
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click(); //clicking on submit button for leave apply
	    Thread.sleep(1000);
  }



}
