package dataProvider_And_Parallel_Testing;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.testng.annotations.Parameters;



public class paramTest
{
	WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser"})
	void setup(String br) throws InterruptedException {
		
		
		switch (br) {
		case "edge": driver = new EdgeDriver();
		break;
		
		case "chrome": driver = new ChromeDriver();
		break;
		
		default: System.out.println("Invalid Browser");
			return;
		}
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	

	@Test
	void test() {
		
	boolean status = driver.findElement(By.xpath("//div[@class='orangehrm-login-slot-wrapper']")).isDisplayed();
	
	Assert.assertEquals(status, true);
	
	System.out.println("working");
	
	}
	
	@AfterClass
	void tearDown() {
		
		driver.quit();
		
	}
	
	
}
