package com.test.triangle.identifier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class TriangleTypeTests {


	@Test
	void isATriangleTest() {

		String result = TriangleType.getTriangleType(2,4, 7);
		assertEquals("Not a Triangle", result);

	}

	@Test
	void isATriangleTest2() {

		String result = TriangleType.getTriangleType(7,3, 3);
		assertEquals("Not a Triangle", result);

	}

	@Test
	void isATriangleTest3() {

		String result = TriangleType.getTriangleType(3,7, 3);
		assertEquals("Not a Triangle", result);

	}

	@Test
	void isIsocelesTriangleTest() {

		String result = TriangleType.getTriangleType(2,2, 1);
		assertEquals("isosceles", result);

	}

	@Test
	void isIsocelesTriangleTest2() {

		String result = TriangleType.getTriangleType(1,2, 2);
		assertEquals("isosceles", result);

	}

	@Test
	void isIsocelesTriangleTest3() {

		String result = TriangleType.getTriangleType(2,3, 2);
		assertEquals("isosceles", result);

	}

	@Test
	void isEquilateralTriangleTest() {

		String result = TriangleType.getTriangleType(2,2, 2);
		assertEquals("equilateral", result);

	}

	@Test
	void isScaleneTriangleTest() {

		String result = TriangleType.getTriangleType(2,3, 4);
		assertEquals("scalene", result);

	}

}
