package calcitesting;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class calcitestingTest {

	@Test
	void test_calcitesting_givenZero_shouldReturnzero()
	{
		calcitesting ca = new calcitesting();
		Assertions.assertEquals(ca.calculate(""),0);

	}
	
	@Test
	void test_calcitesting_givenSingleDigit_shouldReturnSingleDigit() {
		calcitesting ca = new calcitesting();
		Assertions.assertEquals(ca.calculate("2"),2);
	}
	@Test
	void test_Calculator_givenDoubleDigit_shouldReturnAdditionDoubleDigit(){
		calcitesting ca = new calcitesting();
		Assertions.assertEquals(ca.calculate(2,2), 4);
	}
}


