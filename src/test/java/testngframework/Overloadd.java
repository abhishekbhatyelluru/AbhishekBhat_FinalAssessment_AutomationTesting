//TestNG is an automation testing framework in which NG stands for “Next Generation”. TestNG is inspired by JUnit which uses the annotations (@)

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
		  driver = new ChromeDriver(); //Calling the webdriver
		  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Adding the time delay
		  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"); // Opening the application in chrome
		  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");     //Entering the username
	      driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123"); //Entering the password
	      driver.findElement(By.xpath("//button[@type='submit']")).click(); //Clicking on the submit button
	      driver.findElement(By.xpath("//span")).click(); //Selecting the admin field
	      Overloadd obj=new Overloadd(); //creating the object
	      obj.search("Admin");  //calling the objects
	      obj.search("Admin","Paul Collings"); //calling the objects
		  
	  }
	  @Test
	  public void search(String userName) //method with parameter
	  {
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS); //Adding time delay
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName); //enter the username 
			driver.findElement(By.xpath("//button[@type='submit']")).click(); //clicking on submit button
	  }
	  @Test
	  public void search(String userName,String empname) //method with parameter
	  {
		    driver.findElement(By.xpath("//div[2]/input")).click(); //Click on username field
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName); //clearing the default name and adding the new username
			driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname); //Enter the employee name
			driver.findElement(By.xpath("//button[@type='submit']")).click(); //clicking on submit button
	  }


	}