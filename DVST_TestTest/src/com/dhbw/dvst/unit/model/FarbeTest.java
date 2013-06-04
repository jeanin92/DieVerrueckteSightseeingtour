package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Farbe;

import junit.framework.TestCase;

public class FarbeTest extends TestCase {

	private Farbe colour;

	public FarbeTest() {
		super();
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		this.colour = new Farbe("gruen", "green");
	}
	
	public void testObFarbvergleichBeiGleichemDeutschenTextTrueZurueckgibt() {
		boolean actual = this.colour.compare("gruen");
		assertEquals(actual, true);
	}
	
	public void testObFarbvergleichBeiGleichemEnglischemTextTrueZurueckgibt() {
		boolean actual = this.colour.compare("green");
		assertEquals(actual, true);
	}
	
	public void testObFarbvergleichBeiAnderemTextFalseZurueckgibt() {
		boolean actual = this.colour.compare("grün");
		assertEquals(actual, false);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
