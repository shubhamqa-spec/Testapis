package api.test;

import org.testng.annotations.Test;

import api.endpoints.UserEndpoints;
import api.payload.User;
import api.utils.DataProviders;
import io.restassured.response.Response;
import junit.framework.Assert;

public class DDTests {

    @Test(priority = 1, dataProvider = "Data", dataProviderClass = DataProviders.class)
    public void testPostUser(String userID,String fname, String lname, String useremail, String pwd, String ph) {
        
        User userPayload = new User();

        userPayload.setId(Integer.parseInt(userID));
        userPayload.setFirstName(fname);
        userPayload.setLastName(lname);
        userPayload.setEmail(useremail);
        userPayload.setPassword(pwd);
        userPayload.setPhone(ph);

       Response response=UserEndpoints.createUser(userPayload);
       Assert.assertEquals(response.getStatusCode(),200);
    }
    
    
    @Test(priority = 2, dataProvider = "useremail", dataProviderClass = DataProviders.class)
    public void testDeleteUserEmails(String useremail)
    {
        Response response = UserEndpoints.deleteUser(useremail);
        Assert.assertEquals(response.getStatusCode(), 200);
    }
}







