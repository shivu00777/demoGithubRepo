package testNG_Methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DependsOnMethodsExample {

    WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver(); // No need to set system property
        driver.manage().window().maximize();
    }

    @Test
    public void openBrowser() {
        driver.get("https://www.google.com");
        System.out.println("Opened Google");
    }

    @Test(dependsOnMethods = {"openBrowser"})
    public void searchSomething() {
        // Here you'd normally locate and interact with the search box
        System.out.println("Performing search on Google");
    }

    @Test(dependsOnMethods = {"searchSomething"})
    public void verifyResults() {
        System.out.println("Verifying search results");
    }

    @AfterClass
    public void tearDown() {
       driver.quit();
       
        System.out.println("Browser closed");
    }
}
