package testingjunit;

import static org.junit.Assert.assertEquals;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import junit.module1;

class Testmodul1 {

	@Test
	void test() {
		module1 mod = new module1();
		int sum = mod.add(3, 5);
		assertEquals(8,sum);
		
	}
	
	@Ignore
	@Test
	void test2() {
		module1 div2 = new module1();
		int div = div2.div(5, 2);
		assertEquals(2,div);
	}
}
