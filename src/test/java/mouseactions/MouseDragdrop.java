//Mouse action-Drag and Drop

package mouseactions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseDragdrop {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.chrome.driver", "C:\\Abhishek\\chromedriver.exe");
	       WebDriver driver = new ChromeDriver();   //Calling the webdriver
	       driver.get("http://www.jqueryui.com/droppable/"); // Opening the application in chrome
	       Actions mouse= new Actions(driver); //Actions is function
        driver.manage().window().maximize(); //maximizing the chrome window
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS); //Adding the delay
        driver.switchTo().frame(0); //Switching to the frame
        WebElement drag=driver.findElement(By.id("draggable")); //Drag the function
        WebElement drop=driver.findElement(By.id("droppable")); //Drop the function
        mouse.dragAndDrop(drag,drop).perform(); //using draganddrop function move the element
        Thread.sleep(3000); //adding thread delay

	}

}
