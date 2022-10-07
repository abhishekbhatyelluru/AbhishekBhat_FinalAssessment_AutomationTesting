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
	    WebDriver driver = new ChromeDriver();
		driver.get("http://www.aptransport.org/");
		
	    Actions mouse= new Actions(driver);
        driver.manage().window().maximize();
        Thread.sleep(1000);
        WebElement clickable = driver.findElement(By.linkText("REGISTRATION"));
        new Actions(driver).click(clickable).perform();
	    
	}

}
