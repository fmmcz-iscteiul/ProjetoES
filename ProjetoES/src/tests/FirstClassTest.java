package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import firstpackage.FirstClass;

class FirstClassTest {

	public static FirstClass fc;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		fc = new FirstClass();
	}

	@Test
	void test() {
		assertEquals(fc.helloWorld(), fc.helloWorld());
	}

}
