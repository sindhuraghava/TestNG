package API;

import static org.junit.Assert.assertEquals;


import io.restassured.RestAssured;
import io.restassured.response.Response;

public class AuthBAsedAPI {
	public static void testauth(String username,String passwors,int statuscode) {
		RestAssured.baseURI="https://postman-echo.com/";
		Response res=RestAssured.given().auth().preemptive().basic(username, passwors).get("basic-auth").then().extract().response();
		//System.out.println(res.getStatusCode());
		assertEquals(statuscode,res.getStatusCode());
		
	}
}
