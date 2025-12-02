package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

// Open Application
// Test logo Presence
// Login
// close


public class OrangeHRM {
 

	WebDriver driver; 
	
	
	@Test(priority=1)
	void OpenApp() {
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		
	}


	@Test(priority=2)
	void testLogo() throws InterruptedException {
		Thread.sleep(2000);
		boolean status = driver.findElement(By.xpath("//img[@alt='company-branding']")).isDisplayed();
		System.out.println("logo is "+status);
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");  // click on User-name placeholder
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");  // Click on Password Placeholder
		
		
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();  // Click on Login Button
		
		Thread.sleep(2000);
	}



	
	@Test(priority=3)
	void closeApp() {
		
		driver.quit();

	}
	
}
