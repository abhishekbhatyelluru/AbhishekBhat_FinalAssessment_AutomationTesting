//Prompt Alert
package alerts;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");   //Calling the webdriver
	    WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);  //Adding the delay
        
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");  // Opening the application in chrome
        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
        Alert alerttprompt = driver.switchTo().alert(); //Alert Function
        String name = alerttprompt.getText();     //Extracting the text
        System.out.println("Alert text is: " + name); //Printing the text
        Thread.sleep(2000);
        alerttprompt.sendKeys("Abhishek Bhat"); //Sending the input to the window
        Thread.sleep(1000);//Thread Delay
        alerttprompt.accept();  //Accepting in alert window.
		   

	}

}
