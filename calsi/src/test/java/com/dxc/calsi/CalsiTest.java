package com.dxc.calsi;

import static org.junit.Assert.*;

import org.junit.Test;

public class CalsiTest {

	@Test
	public void testAdd() {
		int actual = Calsi.add(5, 5);
		assertEquals(actual,10);
	}

	@Test
	public void testSub() {
		int actual = Calsi.sub(8, 4);
		assertEquals(actual,4);
	}

}
