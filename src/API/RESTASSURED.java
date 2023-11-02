package API;



import static org.junit.Assert.assertEquals;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;

public class RESTASSURED {

	public static void main(String[] args) {
		validateGenderAPI("sindhu","female");
		validateGenderAPI("godi","female");
	}

public static void validateGenderAPI(String name,String ExpectedGender) {
		// API Calling
				RestAssured.baseURI="https://api.genderize.io/";
				RequestSpecification req =RestAssured.given();
				//direct one line calling
				//RestAssured.given().queryParam("name", name).get().then().extract().response();
				
				//sending request details
				req.queryParam("name",name);
				Response res=req.get();
				
				//get data from response
				int statuscode = res.getStatusCode();
				System.out.println(statuscode);
				//statsuline
				System.out.println(res.getStatusLine());
				//response header
				System.out.println(res.getHeader("Content-Type"));
				//all headers
				Headers resheader = res.getHeaders();
				System.out.println(res.getHeaders());
				for(Header h : resheader) {
					System.out.print("name is "+h.getName());
					System.out.println(" value is "+h.getValue());
				}
				//reposnse values
				ResponseBody resbody =res.getBody();
				JsonPath path=resbody.jsonPath();
				//System.out.println("name is "+path.getString("name"));
				//System.out.println("count is "+path.getLong("count"));
				//System.out.println("probability is "+path.getDouble("probability"));
				assertEquals(name,path.getString("name"));
				assertEquals(ExpectedGender,path.getString("gender"));
			
				
	}
}

