package api.test;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


import com.github.javafaker.Faker;

import api.endpoints.UserEndpoints;
import api.payload.Order;
import io.restassured.response.Response;
import junit.framework.Assert;

public class StoreTests {
	
	
	Faker faker;
	Order storepayload;
	
	@BeforeClass
	public void setupData()
	{
		
		faker=new Faker();
		storepayload=new Order();
		
		storepayload.setId(faker.number().randomDigitNotZero());
		storepayload.setPetId(faker.number().numberBetween(1, 10));
		storepayload.setQuantity(faker.number().numberBetween(1, 5));
		storepayload.setShipDate(java.time.ZonedDateTime.now().toString());
		storepayload.setStatus("placed");
		storepayload.setComplete(true);
		
	}
	
	@Test (priority=1)
	public void readStoreOrder()
	{
		
			Response response=UserEndpoints.readStore();
			response.then().log().all();
			Assert.assertEquals(response.getStatusCode(),200); 
			
	}
	
	@Test (priority=2)
	 public void createStoreOrder()
	 {
		 
	        Response response = UserEndpoints.createStore(storepayload);  // ✅ Order payload
	        response.then().log().all();
	        Assert.assertEquals(response.getStatusCode(), 200);
	        
	        
	   }
	
	
	
	
}
