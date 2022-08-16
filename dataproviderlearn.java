package scripts;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataproviderlearn {
  @Test(dataProvider="getData")
  public void login(String user, String pass) throws InterruptedException {
	  WebDriver driver;
  
	System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARUN\\eclipse-workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");
		 driver = new ChromeDriver();
			driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(user);
		 Thread.sleep(3000);
			driver.findElement(By.xpath("//input[@id='password']")).sendKeys(pass);
			driver.close();
  }
  @DataProvider
  public Object [][] getData()
  {
	  Object [][] data = new Object[3][2];
	  
	  data[0][0] ="user1";
	  data[0][1] ="pass1";
	  
	  data[1][0] ="user2";
	  data[1][1] ="pass2";
	  
	  data[2][0] ="user3";
	  data[2][1] ="pass3";
	return data;
  }
  
  
}
