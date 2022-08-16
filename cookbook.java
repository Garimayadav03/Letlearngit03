package scripts;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;

public class cookbook {
	WebDriver driver;

	@Test
	public void multidrop() {
		WebElement drop = driver.findElement(By.name("color"));
		Select select = new Select(drop);
		List<WebElement> options = select.getOptions();
	
		select.selectByIndex(0);
		select.selectByIndex(3);
		select.selectByIndex(2);
		List<WebElement> selectedoptions = select.getAllSelectedOptions();
		System.out.println("All the selected options in the dropdown");

		for (WebElement hells : selectedoptions) {
			System.out.println(hells.getText());
		}
		
		System.out.println("All the options in the dropdown");
		for (WebElement hell : options) {
			System.out.println(hell.getText());
		}

		
	}
	@Test
	public void singleselectdrop() {
		WebElement singdrop = driver.findElement(By.xpath("//select[@name='make']"));
		Select one = new Select(singdrop);
		 one.selectByIndex(3);
		one.selectByValue("audi");
		 List <WebElement> selecone = one.getOptions();
		 System.out.println("All the options in the dropdown");
		 for (WebElement seleones : selecone) {
			 System.out.println(seleones.getText());
			 
		 }
		WebElement op = one.getFirstSelectedOption();
		 System.out.println("First selected options in the dropdown");
		 System.out.println(op.getText());
		
	}
	@BeforeMethod
	public void beforeMethod() throws InterruptedException {
		driver.get(" http://cookbook.seleniumacademy.com/Config.html");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}

	@AfterMethod
	public void afterMethod() {
	}

	@BeforeClass

	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\ARUN\\eclipse-workspace\\webdrivertraining\\test\\resources\\chromedriver.exe");
		driver = new ChromeDriver();
	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

}
