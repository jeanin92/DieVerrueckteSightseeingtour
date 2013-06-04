package com.dhbw.dvst.unit.activities;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllActivityUnitTests {

	public static Test suite() {
		TestSuite suite = new TestSuite();
		suite.addTestSuite(StartActivityTest.class);
		return suite;
	}
}
