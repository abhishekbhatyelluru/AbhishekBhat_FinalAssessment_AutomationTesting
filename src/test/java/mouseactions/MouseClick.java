//Mouse Action-click

package mouseactions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseClick {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();   //Calling the webdriver
		driver.get("http://www.aptransport.org/"); // Opening the application in chrome
		
	    Actions mouse= new Actions(driver); //Actions is a function
        driver.manage().window().maximize(); //maximizing the window
        Thread.sleep(1000);
        WebElement clickable = driver.findElement(By.linkText("REGISTRATION")); //finding registration using linktext
        new Actions(driver).click(clickable).perform(); //Clicking on the perticular element
	    
	    
	}

}
