package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");  //Calling the webdriver
	    WebDriver driver = new ChromeDriver();
	    
		  driver.get("https://netbanking.hdfcbank.com/netbanking/"); // Opening the application in chrome
		  driver.switchTo().frame("login_page");  //switch to the frame
		  driver.findElement(By.linkText("CONTINUE")).click();  //Finding the element using xpath
		  Alert simpleAlert=driver.switchTo().alert();   //switching to alert window using alert function
		  Thread.sleep(1000);
		  simpleAlert.accept(); //accepting the command in alert window
	}

}
