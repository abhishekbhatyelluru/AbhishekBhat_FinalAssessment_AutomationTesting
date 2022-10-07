
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
	    WebDriver driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	    
	    //Login Function
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    
	    //Leave Function
	    driver.findElement(By.linkText("Leave")).click();
	    driver.findElement(By.linkText("Apply")).click();
	    driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click();
	    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();
	    driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25");
	    driver.findElement(By.xpath("//textarea")).sendKeys("work from home");
	    Thread.sleep(1000);
	    
	    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();
	    Thread.sleep(1000);
  }



}
