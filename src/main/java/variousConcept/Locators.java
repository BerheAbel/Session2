package variousConcept;


import java.util.concurrent.TimeUnit;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Locators {

	
	WebDriver driver;
	
	@Before
	public void init() {
		
		
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.objectspy.space/");
	
	}
	@Test
	public void testlocator() {
		//using name
		//driver.findElement(By.name("firstname")).sendKeys("selenium");
		//using Id
		driver.findElement(By.id("sex-0")).click();
		//using class name
		driver.findElement(By.className("input-file")).sendKeys("C:\\Users\\abelb\\OneDrive\\Desktop");
	
		//using link text
		//driver.findElement(By.linkText("XML vs Excel")).click();
		//partial link text
		//driver.findElement(By.partialLinkText("FrontEnd")).click();
		driver.findElement(By.cssSelector("input#exp-3")).click();
		driver.findElement(By.cssSelector("input[value='Selenium Webdriver']")).click();
		driver.findElement(By.xpath("html/body/div/div[2]/div[2]/form/div[7]/input")).sendKeys("bella");
		driver.findElement(By.xpath("//input[@name='firstname']")).clear();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("rich");
		driver.findElement(By.xpath("//input[@type='checkbox' and @name='tool' and @id='tool-0']")).click();
	//	driver.findElement(By.xpath("//strong[text()='Link Test : New Page']")).click();
		//driver.findElement(By.xpath("//strong[text()='Link Test : Page Change']")).click();
	//	driver.findElement(By.xpath("//strong[contains(text(),'Link Test : Page Change')]")).click();
		WebElement home_page_driver = driver.findElement(By.xpath("//h1[contains(text(),'Practice Automation Form')]"));
		Assert.assertEquals("button is not availabe", "Practice Automation Form",home_page_driver.getText() );
			
		
		
	}
	
	
	//@After
	public void teardown() {
		driver.close();
		
	}


}
