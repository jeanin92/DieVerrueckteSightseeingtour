package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Ausrichtung;
import com.dhbw.dvst.models.Kreuzung;
import com.dhbw.dvst.models.Kurve;
import com.dhbw.dvst.models.Spielbrett;
import junit.framework.TestCase;

public class SpielbrettTest extends TestCase{

	private Spielbrett testBrett;

	public SpielbrettTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		testBrett = new Spielbrett();
	}
	
	public void testObAlleSpielplattenArrayWiederLeerIst() {
		assertEquals(0, this.testBrett.getUnsortiertesIntPlattenArray().size());
	}
	
	public void testObSpielplattenArrayKorrekteLaengeHat() {
		assertEquals(50, this.testBrett.getAlleSpielplatten().size());	
	}
	
	public void testeVorletztesElement() {
		assertEquals(new Kurve(Ausrichtung.KURVEOBENLINKS).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(48).getAusrichtung());
	}
	
	public void testeDrittesElement() {
		assertEquals(new Kreuzung(Ausrichtung.KREUZUNGUNTEN).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(2).getAusrichtung());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
