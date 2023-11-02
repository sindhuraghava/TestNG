package API;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class callpostAPI {
	public static void testapi() {
		String reqbody= "{\"id\": 0,\"petId\": 0,\"quantity\": 0,\"shipDate\": \"2023-10-19T04:21:55.067Z\",\"status\": \"placed\",\"complete\": true}";
		RestAssured.baseURI="https://petstore.swagger.io/";
		Response res=RestAssured.given().header("Content-type","application/json").body(reqbody).post("v2/store/order").then().extract().response();
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
	}
}
