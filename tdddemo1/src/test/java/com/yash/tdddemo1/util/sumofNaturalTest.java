package com.yash.tdddemo1.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class sumofNaturalTest {
	 int num ,sum =0;
	sumofNatural s1 = new sumofNatural();
	@Test
	public void ifInput_Is_one__Then_return_zero() {
		
		 assertEquals(s1.calculatesum(1),0);
 	}
	@Test
	public void ifInput_Is_two__Then_return_zero() {
		
		 assertEquals(s1.calculatesum(2),0);
 	}
   
	@Test
	public void ifInput_Is_three__Then_return_three() {
		
		 assertEquals(s1.calculatesum(3),3);
 	}
	@Test
	public void ifInput_Is_greaterThenfour__Then_return_sum() {
		 
		 assertEquals(s1.calculatesum(num),sum);
 	}
	
}
