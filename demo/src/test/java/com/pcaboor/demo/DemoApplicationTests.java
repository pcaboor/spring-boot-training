package com.pcaboor.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class HelloworldApplicationTests {

	@Autowired
	private BusinessService bs;

	@Test
	void contextLoads() {
	}

	@Test
	public void testGetHelloWorld() {

		String expected = "Hello World!";

		String result = bs.getHelloWorld().getValue();

		assertEquals(expected, result);
	}

}