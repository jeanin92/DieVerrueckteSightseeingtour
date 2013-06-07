package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Ausrichtung;
import com.dhbw.dvst.models.Gerade;

import junit.framework.TestCase;

public class GeradenTest extends TestCase {

	private Gerade gerade;
	private Gerade randomGerade;
	
	public GeradenTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		this.gerade = new Gerade(Ausrichtung.GERADESENKRECHT);
		this.randomGerade = new Gerade();
	}
	
	public void testObRandomKonstruktorEineAusrichtungSetzt() {
		assertNotNull(this.randomGerade.getAusrichtung());
	}
	
	public void testObrandomKonstruktorAusrichtungAufGueltigenWertSetzt() {
		assertTrue(this.randomGerade.getAusrichtung() == Ausrichtung.GERADESENKRECHT
				|| this.randomGerade.getAusrichtung() == Ausrichtung.GERADEWAAGERECHT);
		
	}
	
	public void testObRandomArrayZweiElementeHat() {
		assertEquals(this.gerade.getAusrichtungsArray().length, 2);
	}
	
	public void testObSpielplatteNachRechtsDrehenVonSenkrechtNachWaagerechtDreht() {
		this.gerade.dreheSpielplatteNachRechts();
		assertEquals(gerade.getAusrichtung(), Ausrichtung.GERADEWAAGERECHT);
	}
	
	public void testObSpielplatteZweimalNachLinksDrehenVonSenkrechtNachSenkrechtDreht() {
		this.gerade.dreheSpielplatteNachLinks();
		this.gerade.dreheSpielplatteNachLinks();
		assertEquals(gerade.getAusrichtung(), Ausrichtung.GERADESENKRECHT);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}