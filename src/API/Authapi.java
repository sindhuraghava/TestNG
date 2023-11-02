package API;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Authapi {

	@Test
	void testauthapi() {
		AuthBAsedAPI.testauth("postman", "password",200);
		AuthBAsedAPI.testauth("postma", "password",401);
	}
	void testpostapi() {
		callpostAPI.testapi();
	}
}
