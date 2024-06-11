package com.example.devopstask;

import com.example.devopstask.controllers.HelloController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DevopsTaskApplicationTests {
	private final HelloController controller;

	public DevopsTaskApplicationTests() {
		this.controller = new HelloController();
	}

	@Test
	void testHello() {
		String resp = controller.sayHello();
		Assertions.assertEquals("Hello, boy!", resp);
	}

	@Test
	void sayBye() {
		String resp = controller.sayBye();
		Assertions.assertEquals("Bye bye, my friend", resp);
	}



	@Test
	void testAddition() {
		Assertions.assertEquals(5.0, controller.addition(3, 2));
	}

	@Test
	void testSubtraction() {
		Assertions.assertEquals(1.0, controller.substract(3, 2));
	}

	@Test
	void testMultiply() {
		Assertions.assertEquals(6.0, controller.multiply(3, 2));
	}

	@Test
	void testDivision() {
		Assertions.assertEquals(6.0, controller.divide(12, 2));
	}
	@Test
	void testZeroDivision() {
		Assertions.assertEquals(Double.POSITIVE_INFINITY, controller.divide(1, 0));
	}


}
