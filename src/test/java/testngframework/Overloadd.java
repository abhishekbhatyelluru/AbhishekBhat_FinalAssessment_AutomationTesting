package testngframework;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Overloadd {
	private static WebDriver driver = null;
	
  @Test
  public void login() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	  //WebDriver driver = new ChromeDriver();
	  driver = new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     
      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
      driver.findElement(By.xpath("//button[@type='submit']")).click();
      driver.findElement(By.xpath("//span")).click();
      Overloadd obj=new Overloadd();
      obj.search("Admin");
      obj.search("Admin","Paul Collings");
	  
  }
  @Test
  public void search(String userName)
  {
	    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @Test
  public void search(String userName,String empname)
  {
	    driver.findElement(By.xpath("//div[2]/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
  }


}
