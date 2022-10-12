//Mouse action-Hover

package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver(); //Calling the webdriver
	    
	    driver.get("http://www.aptransport.org/"); // Opening the application in chrome
        Actions mouse= new Actions(driver); //Actions is a predefined function
        driver.manage().window().maximize(); //maximizing the window
        Thread.sleep(1000);
        mouse.moveToElement(driver.findElement(By.linkText("PERMITS"))).build().perform(); //Using the movetoelemet hover over a perticular web element

	}

}
