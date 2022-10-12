/* 
  Web Elements - Find the web elements using Locators ( Id, Name and XPath )
  Elements present on Dashboards (pick any 4 elements, mention name of elements and find using above mentioned locators
*/


package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsDashboard {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver(); //Calling the webdriver
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// Opening the application in chrome
	        driver.manage().window().maximize(); //maximize the chrome window
	        Thread.sleep(1000);
	        
	        //Login Function
	        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter the username in login page
	    	driver.findElement(By.name("password")).sendKeys("admin123"); //Enter the Password
		    driver.findElement(By.xpath("//button[@type='submit']")).click(); //Click on submit button
		    
		    //Elements in Dashboard
		    
		    //To select the My info
		    driver.findElement(By.linkText("My Info")).click();
		    //To select the Admin
		    driver.findElement(By.xpath("//div[2]/input")).click();
		    //To select Leave
		    driver.findElement(By.linkText("Leave")).click();
		    //To select Time 
		    driver.findElement(By.linkText("Time")).click();
	 

	}

}
