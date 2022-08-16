package scripts;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class dragdrop {

	 @Test
	  public void drag() throws InterruptedException  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\ARUN\\eclipse-workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");		
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			 driver.get("http://the-internet.herokuapp.com");
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[normalize-space()='Drag and Drop']")).click();
			 Actions ace = new Actions(driver);
 WebElement drag1 = driver.findElement(By.xpath("//div[@id='column-a']"));
 WebElement drop2 = driver.findElement(By.xpath("//div[@id='column-b']"));			
ace.dragAndDrop(drag1, drop2).perform();
String text = driver.findElement(By.id("column-b")).getText();
//ace.clickAndHold(drag1).release(drop2).build().perform();
System.out.println(text);
 //WebElement heading = driver.findElement(By.tagName("h3"));
//ace.moveToElement(heading).doubleClick().build().perform();
		}	
	 
	
			
	}


