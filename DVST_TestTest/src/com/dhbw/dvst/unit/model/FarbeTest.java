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
		this.colour = new Farbe("grün", "green");
	}
	
	public void testObFarbvergleichBeiGleichemDeutschenTextTrueZurueckgibt() {
		boolean actual = this.colour.compare("grün");
		assertEquals(actual, true);
	}
	
	public void testObFarbvergleichBeiGleichemEnglischemTextTrueZurueckgibt() {
		boolean actual = this.colour.compare("green");
		assertEquals(actual, true);
	}
	
	public void testObFarbvergleichBeiAnderemTextFalseZurueckgibt() {
		boolean actual = this.colour.compare("gruen");
		assertEquals(false, actual);
	}
	
	public void testObGetTextDenEnglischenTextZurueckgibt() {
		String text = this.colour.getText_en();
		assertEquals(text, "green");
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
