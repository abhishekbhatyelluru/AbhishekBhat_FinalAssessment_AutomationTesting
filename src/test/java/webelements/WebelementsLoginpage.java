/*
 
 1. Web Elements - Find the web elements using Locators ( Id, Name and XPath )
 A. Elements present on Login page 

*/

package webelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementsLoginpage {

	public static void main(String[] args) throws InterruptedException {
		   System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
		    WebDriver driver = new ChromeDriver();//Calling the webdriver
	        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");// Opening the application in chrome
	        driver.manage().window().maximize();//maximize the chrome window
	        Thread.sleep(1000);
	        driver.findElement(By.name("username")).sendKeys("Admin"); //Enter the username in login page
	    //  driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	        driver.findElement(By.name("password")).sendKeys("admin123");//Enter the Password
	  //    driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
	        driver.findElement(By.xpath("//button[@type='submit']")).click();//Click on submit button
	        
		
		
		

	}

}
