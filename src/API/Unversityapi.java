package API;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;

public class Unversityapi {
	
	public static void testuniversityAPI(String country,String state) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country",country).get("search").then().extract().response();
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		//assertEquals("200",res.getStatusCode());
		ResponseBody resbody = res.getBody();
		JsonPath respath = resbody.jsonPath();
		List<String> statelist = respath.getList("state-province");
		System.out.println(statelist);
		int c=0;
		for (int i=0;i<statelist.size();i++) {
			if(statelist.get(i)!= null) {
			if(statelist.get(i).equals(state)) {
				c=c+1;
			}
			}
		}
		System.out.println(c);
	}
	public static void checkuniversitypresent(String country,String name) {
		RestAssured.baseURI="http://universities.hipolabs.com/";
		Response res=RestAssured.given().queryParam("country",country).get("search").then().extract().response();
		System.out.println(res.getStatusCode());
		System.out.println(res.getStatusLine());
		//assertEquals("200",res.getStatusCode());
		ResponseBody resbody = res.getBody();
		JsonPath respath = resbody.jsonPath();
		List<String> universitylist = respath.getList("name");
		
		Boolean found = false;
		for (int i=0;i<universitylist.size();i++) {
			
			if(universitylist.get(i).equals(name)) {
				found = true;
				break;
			}
		}
		if(found) {
			System.out.println("exist");
		}
		else
			System.out.println("not exist");
	}

}
