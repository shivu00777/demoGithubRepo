package Assertions;

import org.testng.Assert;
import org.testng.annotations.Test;

public class assertionsDemo {

	
	@Test
	void stringCompare() {
		
		String str1 = "shivam";
		String str2 = "shivam";
		
//		if(str1.equalsIgnoreCase(str2)) {          // This way of assertion or validation of element is not consider
//			
//			System.out.println("Equals");
//			
//		}
//		
//		
//		else{
//			
//			System.out.println("Not Equal");
//			
//		}
		
	
		Assert.assertEquals(str1, str2);        // this method/way we use for assertion
	
	
	
	}
	
	
}
