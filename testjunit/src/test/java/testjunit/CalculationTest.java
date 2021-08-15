package testjunit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void test() {
		Calculation calculation = new Calculation();
		int expected = 2;
		int actual = calculation.add(1, 1);
		assertEquals(expected,actual);
	}
	@Test
	void test_calculation_givenZero_shouldReturnzero()
	{
		Calculation calculation = new Calculation();
		int expected = 0;
		int actual = calculation.add("");
	  assertEquals(expected,actual);

	}
	@Test
	void test_calculation_givenSingleDigit_shouldReturnSingleDigit() {
		Calculation calculation = new Calculation();
		int expected = 2;
		int actual = calculation.add("2");
		assertEquals(expected,actual);
	}

}