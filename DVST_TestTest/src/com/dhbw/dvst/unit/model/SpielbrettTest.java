package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Spielbrett;

import junit.framework.TestCase;

public class SpielbrettTest extends TestCase{

	public SpielbrettTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		Spielbrett testBrett = new Spielbrett(null);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
