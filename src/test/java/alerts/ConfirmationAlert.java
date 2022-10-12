//An Alert in Selenium is a small message box which appears on screen to give the user some information or notification
//This confirmation alert asks permission to do some type of operation
package alerts;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");  
	    WebDriver driver = new ChromeDriver();  //Calling the webdriver.
	    
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://the-internet.herokuapp.com/javascript_alerts"); // Opening the application in chrome

        driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click(); //Click on confirm using Xpath
        Alert alerttconfirm = driver.switchTo().alert();  //Switching to alet window using alert function
        String name = alerttconfirm.getText();        //Extracting The text
        System.out.println("Alert text is: " + name);   //Printing the text
        Thread.sleep(2000);
        alerttconfirm.accept();     //Accepting in alert window.
 	   
	}

}
