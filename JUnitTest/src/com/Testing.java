package com;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

class Testing {

	@Test
	void test() {
		ArmOrNot test = new ArmOrNot();
		int output = test.armstrong(351);
		assertEquals(0,output);
	}

}
