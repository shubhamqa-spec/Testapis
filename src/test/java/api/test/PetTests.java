package api.test;


import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import io.restassured.response.Response;
import junit.framework.Assert;

public class PetTests {
	
	
	@Test (priority=1)
	public void readPet()
	{
		
			Response response=UserEndpoints.readPetid();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200); 
			
	}
	
	
	@Test (priority=2)
	 public void createPetid()
	 {      
		     
		    int num = 2;
		    String name = "Fluffy";
	        Response response = UserEndpoints.createpet(num,name); 
	        response.then().log().all();
	        Assert.assertEquals(response.getStatusCode(), 200);
	        
	        
	   }
	
	
}
