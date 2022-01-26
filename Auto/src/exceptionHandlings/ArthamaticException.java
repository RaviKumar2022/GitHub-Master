package exceptionHandlings;

import org.testng.annotations.Test;

public class ArthamaticException {
	
	@Test
	public void division() {
		try {
		int x = 20/0 ; 
		}
		
		catch (Exception e) {
		  System.out.println("Executing program");
	  
	
		}
	
	}
}
 