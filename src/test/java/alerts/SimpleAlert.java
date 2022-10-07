package alerts;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleAlert {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    
		  driver.get("https://netbanking.hdfcbank.com/netbanking/");
		  driver.switchTo().frame("login_page");
		  driver.findElement(By.linkText("CONTINUE")).click();
		  Alert simpleAlert=driver.switchTo().alert();
		  Thread.sleep(1000);
		  simpleAlert.accept();
	
	}

}
