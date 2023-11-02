package API;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RESTASSUREDTest {

	@Test
	void testGENDERAPI() {
		RESTASSURED.validateGenderAPI("sindhu","female");
		RESTASSURED.validateGenderAPI("gobi","male");
	}

}
