package Assertions;

import java.sql.Driver;
import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class hardVSsoftAssertions {

	
	
	//@Test
	void test_hardAssertion() {
	
		WebDriver driver = new ChromeDriver();
		
		Wait<WebDriver> fluentWait = new FluentWait<>(driver)
		        .withTimeout(Duration.ofSeconds(20))
		        .pollingEvery(Duration.ofSeconds(2))
		        .ignoring(NoSuchElementException.class);

		WebElement element = fluentWait.until(driver1 -> driver1.findElement(By.id("dynamicElement")));

		
	System.out.println("hardAssertions");      // HardAssertion
		
	Assert.assertEquals(1, 12);
		
}

	
	@Test
	void test_softAssertion() {
	
	System.out.println("BeforesoftAssertions");
		
	SoftAssert sa = new SoftAssert();    // softAssertion
	
	sa.assertEquals(1, 2);
	
	System.out.println("AftersoftAssertion");
		
	
	sa.assertAll();
	
	
}


}
