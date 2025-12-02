package testNG_Methods;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Beforemethod {

	@BeforeMethod  // Perform Before every method
	void logIn() {
		
		System.out.println("This is login");
		
	}
	
	@Test(priority = 1)  // Normal Test Case
	void search() {
		
		System.out.println("This is search");
		
	}
	
	
	@Test(priority = 2)   // Normal Test Case
	void advancedSearch() {
		
		System.out.println("This is advanced search");
		
	}
	
	
	@AfterMethod        // Perform After Every Method
	void Logout() {
		
		System.out.println("This is Logout");
		
		
	}
	
}
