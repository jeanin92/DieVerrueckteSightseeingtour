package com.dhbw.dvst.unit;


import junit.framework.*;

public class AllModelTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(SpielerTest.class);
		suite.addTestSuite(FarbeTest.class);
		return suite;
	}
}
