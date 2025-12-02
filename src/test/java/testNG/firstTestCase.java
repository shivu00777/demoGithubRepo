package testNG;

import org.testng.annotations.Test;

// Open Application
// Login Application
// Logout Application

public class firstTestCase {

	
	@Test(priority=-9)
	void openApp() {
		
		System.out.println("This is open the app");	
		
	}
	
	
	@Test(priority=2)
	void LoginApp() {
		
		System.out.println("Here we login the app");
		
	}
	
	
	@Test(priority=3)
	void LogOut() {
		
		System.out.println("This is logout the Application");
		
	}
	
	
}	

