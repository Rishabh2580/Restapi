package Rest.Rest;


import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class KKK {
 
    @Test
    public void GetBooksDetails() { 
        RestAssured.baseURI = "https://gorest.co.in/public/v2/users";
        RequestSpecification httpRequest = RestAssured.given(); 
        Response response = httpRequest.request(Method.GET, "");
        
        if(response.getStatusCode() == 200) {
            System.out.println("Request successful! Status received: " + response.getStatusCode()); 
            System.out.println("Response Body: ");
            System.out.println(response.getBody().asString());
        } else {
            System.out.println("Request failed! Status received: " + response.getStatusCode());
        }
    }
}
