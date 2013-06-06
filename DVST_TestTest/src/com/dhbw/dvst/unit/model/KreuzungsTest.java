package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Ausrichtung;
import com.dhbw.dvst.models.Kreuzung;

import junit.framework.TestCase;

public class KreuzungsTest extends TestCase {

	private Kreuzung kreuzung;
	private Kreuzung randomKreuzung;
	public KreuzungsTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		this.kreuzung = new Kreuzung(Ausrichtung.KREUZUNGLINKS);
		this.randomKreuzung = new Kreuzung();
	}
	
	public void testObRandomKonstruktorEineAusrichtungSetzt() {
		assertNotNull(this.randomKreuzung.getAusrichtung());
	}
	
	public void testObrandomKonstruktorAusrichtungAufGueltigenWertSetzt() {
		assertTrue(this.randomKreuzung.getAusrichtung() == Ausrichtung.KREUZUNGLINKS
				|| this.randomKreuzung.getAusrichtung() == Ausrichtung.KREUZUNGOBEN
				|| this.randomKreuzung.getAusrichtung() == Ausrichtung.KREUZUNGRECHTS
				|| this.randomKreuzung.getAusrichtung() == Ausrichtung.KREUZUNGUNTEN);
	}
	
	public void testObRandomArrayVierElementeHat() {
		assertEquals(this.kreuzung.getAusrichtungsArray().length, 4);
	}
	
	public void testObEinmalRechtsDrehenFunktioniert() {
		this.kreuzung.dreheSpielplatteNachRechts();
		assertEquals(this.kreuzung.getAusrichtung(), Ausrichtung.KREUZUNGOBEN);
	}
	
	public void testObDreimalLinksDrehenFunktioniert() {
		this.kreuzung.dreheSpielplatteNachLinks();
		this.kreuzung.dreheSpielplatteNachLinks();
		this.kreuzung.dreheSpielplatteNachLinks();
		assertEquals(this.kreuzung.getAusrichtung(), Ausrichtung.KREUZUNGOBEN);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
