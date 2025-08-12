package api.endpoints;

//import org.apache.xmlbeans.impl.xb.xsdschema.Attribute.Use;


//import com.github.scribejava.core.model.Response;
import static io.restassured.RestAssured.given;


import io.restassured.response.Response;
import api.payload.User;
import api.payload.Order;
import io.restassured.http.ContentType;

public class UserEndpoints {
	
 public static Response createUser(User payload)
 {
	 
	 Response response= given()
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)
			 .body(payload)
		.when()	 
		     .post(routes.post_url);
		     
		 return response;    
}
   
 public static Response readUser(String userName)
 {
	 
	 Response response=given()
			 .pathParam("username",userName)
			 
		.when()	 
		     .get(routes.get_url);
		     
		 return response;    
}
 
 public static Response updateUser(String userName,User payload)
 {
	 
	 Response response= given()
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)
			 .pathParam("username", userName)
			 .body(payload)
		.when()	 
		     .put(routes.update_url);
		     
		 return response;    
}
 
 public static Response deleteUser(String userName)
 {
	 
	 Response response= given()
			 .pathParam("username",userName)
			 
		.when()	 
		     .delete(routes.delete_url);
		     
		 return response;    
}
 
 public static Response LoginUser(User payload)
 {
	 
	 Response response= given()
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)
			 .body(payload)
		.when()	 
		     .get(routes.login_url);
	 
		     
		 return response;    
}
 
 public static Response LogoutUser(User payload)
 {
	 
	 Response response= given()
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)
			 .body(payload)
		.when()	 
		     .get(routes.logout_url);
	 
		     
		 return response;    
}
 
 public static Response readStore()
 {
	 
	 Response response=given()
			 .when()	 
		     .get(routes.get_store_url);
		     
		 return response;    
}
 
 public static Response createStore(Order storepayload)
 {
	 
	 Response response= given()
			 .contentType(ContentType.JSON)
			 .accept(ContentType.JSON)
			 .body(storepayload)
		     .when()	 
		     .post(routes.post_store_url);
		     
		 return response;    
} 
 
 
 public static Response readPetid()
 {
	 
	 Response response=given()
			 .when()	 
		     .get(routes.get_store_url);
		     
		 return response;    
}
 
 public static Response createpet(int petId,String name)
 {
	 
	 Response response= given()
			 .contentType("application/x-www-form-urlencoded")
			 .formParam("petId", petId)
			 .formParam("name", name)
		     .when()	 
		     .post(routes.post_store_url);
		     
		 return response;    
} 
 
 


}
 
 
	
	


