package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Form;

import junit.framework.TestCase;

public class FormTest extends TestCase {

	private Form form;

	public FormTest() {
		super();
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		this.form = new Form("auto", "car");
	}
	
	public void testObFormvergleichBeiGleichemDeutschenTextTrueZurueckgibt() {
		boolean actual = this.form.compare("auto");
		assertEquals(actual, true);
	}
	
	public void testObFormvergleichBeiGleichemEnglischemTextTrueZurueckgibt() {
		boolean actual = this.form.compare("car");
		assertEquals(actual, true);
	}
	
	public void testObFormvergleichBeiAnderemTextFalseZurueckgibt() {
		boolean actual = this.form.compare("bus");
		assertEquals(actual, false);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
