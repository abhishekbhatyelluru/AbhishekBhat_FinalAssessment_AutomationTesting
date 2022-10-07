package stepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HrmLogin {

	private static WebDriver driver = null;

		
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page()
	{
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() 
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");    
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

	}
	@Then("home page is displayed")
	public void home_page_is_displayed() 
	{
		String actualresult, expectedresult;
	    expectedresult="PIM";
	    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText();
	    SoftAssert soft= new SoftAssert();
		soft.assertEquals(actualresult, expectedresult);
	}
	
	//Apply leave
	
	@Then("apply on leave")
	public void apply_on_leave() throws InterruptedException 
	{
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
	
	@Then("search in admin by username")
	public void search_in_admin(String userName)
	{
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName);
			driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("search in admin by username and empid")
	public void search_in_admin(String userName,String empname)
	{
		driver.findElement(By.xpath("//div[2]/input")).click();
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName);
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	
}
