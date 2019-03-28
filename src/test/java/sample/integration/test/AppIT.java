package sample.integration.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppIT {

	@Test
	public void test() {
		assertEquals(System.getProperty("TEST"), "test");
	}
}
