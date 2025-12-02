package dataProvider_And_Parallel_Testing;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {

WebDriver driver;

@BeforeClass
void Login() {
	
	driver = new ChromeDriver();

	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	
	
}


@Test(dataProvider = "dp")
void test(String email, String psw) throws InterruptedException {
	
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
	driver.manage().window().maximize();
	
	driver.findElement(By.cssSelector("input[placeholder='Username']")).sendKeys(email);
	
	driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys(psw);
	
	//Thread.sleep(1000);
	
	driver.findElement(By.cssSelector("button[type='submit']")).click();
	
	//Thread.sleep(2000);
	
	boolean status = driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).isDisplayed();

	if(status == true) {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
		Assert.assertTrue(true);
	
	}
	else {
		
		Assert.fail();
		
	}
	
}


@AfterClass
void tearown(){
	
	driver.quit();
	
	
}



@DataProvider(name="dp", indices= {1})  // It runs only for the specific indices you choose, not for a range.
Object[][] loginData(){
	
Object data[][]= {
			
		{"shivam","shivam123"},
		{"Admin","admin123"},
		
	};
return data;
	
}





}
