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

	private static WebDriver driver = null;//initializing a chrome driver

		
	@Given("browser is open and application is in login page")
	public void browser_is_open_and_application_is_in_login_page()
	{
	 
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		driver = new ChromeDriver();//Calling the webdriver
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	//Adding the time delay
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// Opening the application in chrome
	    
	}

	@When("user enters user name and password")
	public void user_enters_user_name_and_password() 
	{
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);//Adding the time delay
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");    //Entering the username
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin123");//Entering the password
        driver.findElement(By.xpath("//button[@type='submit']")).click();//Clicking on the submit button

	}
	@Then("home page is displayed")
	public void home_page_is_displayed() 
	{
		String actualresult, expectedresult; //initializing the variables
	    expectedresult="PIM"; //set the expected result
	    actualresult=driver.findElement(By.xpath("//img[@alt='client brand banner']")).getText(); //Extract the text from web element
	    SoftAssert soft= new SoftAssert(); //Iniatilizing the soft assert function
		soft.assertEquals(actualresult, expectedresult);
	}
	
	//Apply leave
	
	@Then("apply on leave")
	public void apply_on_leave() throws InterruptedException 
	{
		    driver.findElement(By.linkText("Leave")).click();//Clicking on the leave in dashboard
		    driver.findElement(By.linkText("Apply")).click();//Click on the apply inside the leave function
		    driver.findElement(By.xpath("//div[@class='oxd-select-text-input']")).click(); 
		    driver.findElement(By.xpath("//*[contains(text(),'CAN')]")).click();  //Entering the fields
		    driver.findElement(By.xpath("//input[@placeholder='yyyy-mm-dd']")).sendKeys("2022-04-25"); //Entering the fields
		    driver.findElement(By.xpath("//textarea")).sendKeys("work from home"); //Entering the fields
		    Thread.sleep(1000);//Adding the thread dealy
		    driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space']")).click();//clicking on submit button for leave apply
		    Thread.sleep(1000);//Adding the thread dealy
	}
	
	@Then("search in admin by username")
	public void search_in_admin(String userName)
	{
		    driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);//Adding the dealy
			driver.findElement(By.xpath("//div[2]/input")).sendKeys(userName); //Entering the username in admin field
			driver.findElement(By.xpath("//button[@type='submit']")).click(); //Click on submit
	}
	
	@Then("search in admin by username and empid")
	public void search_in_admin(String userName,String empname)
	{
		driver.findElement(By.xpath("//div[2]/input")).click(); //clicking on the username field
		driver.findElement(By.xpath("//div[2]/input")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE),userName);//clearing the default name and adding the new username
		driver.findElement(By.xpath("//input[@placeholder='Type for hints...']")).sendKeys(empname);//Enter the employee name
		driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking on submit button
	}
	
	
}
