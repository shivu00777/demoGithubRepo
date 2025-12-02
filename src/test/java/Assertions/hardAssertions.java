package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class hardAssertions {

	
	@Test
	void hardAssert() {
		
		//Assert.assertEquals(123, 123);
		//Assert.assertEquals(123, "123");
		
		
		//Assert.assertNotEquals(123, "123");
		
		
		Assert.assertTrue(1==2);
	}
	
	
}
