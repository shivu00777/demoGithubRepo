package testNG_Methods;

import org.testng.annotations.*;

public class AllNotations {

	
	@BeforeSuite
	void Bs() {
		
		System.out.println("This is Before Suit");
		
	}
	
	
	@AfterSuite
	void As() {
		
		System.out.println("This is After Suit");
		
	}


	@BeforeTest
	void Bt() {
		
		System.out.println("This is Before Test");
		
	}

	@AfterTest
	void At() {
		
		System.out.println("This is After Test");
		
	}
	
	
	@Test
	void sampleTest() {
		
		System.out.println("This is sample test 1");
		
		
	}
	
	
	
	@Test
	void sampleTest2() {
		
		System.out.println("This is sample test 2");
		
		
	}
	
	
	
	
	@BeforeClass
	void Bc() {
		
		System.out.println("This is Before Class");
		
	}

	@AfterClass
	void AC() {
		
		System.out.println("This is After Class");
		
	}
	
	
	@BeforeMethod
	void Bm() {
		
		System.out.println("This is Before Method");
		
	}

	@AfterMethod
	void Am() {
		
		System.out.println("This is After Method");
		
	}
	
	
	
	
	
}
