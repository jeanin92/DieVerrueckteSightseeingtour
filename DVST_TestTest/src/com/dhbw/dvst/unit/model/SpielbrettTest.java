package com.dhbw.dvst.unit.model;

import java.util.ArrayList;
import junit.framework.TestCase;

import com.dhbw.dvst.models.Ausrichtung;
import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Kreuzung;
import com.dhbw.dvst.models.Kurve;
import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;

public class SpielbrettTest extends TestCase{

	private Spielbrett testBrett;
	private ArrayList<Spieler> testSpieler = new ArrayList<Spieler>();

	public SpielbrettTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		testBrett = new Spielbrett();
		testSpieler.add(new Spieler("test1", new Spielfigur(new Form("auto", "car"), new Farbe("rot", "red"), "car_red")));
		testSpieler.add(new Spieler("test2", new Spielfigur(new Form("auto", "car"), new Farbe("blau", "blue"), "car_blue")));
		testBrett.fuelleLosesSpielplattenArray();
	}
	
	public void testObLosesSpielPlattenArrayKorrekteLaengeHat() {
		assertEquals(33, testBrett.getAlleSpielplatten().size());
	}
	
	public void testObSpielplattenArrayKorrekteLaengeHat() {
		testBrett.fuegeStatischePlattenEin();
		assertEquals(49, this.testBrett.getAlleSpielplatten().size());	
	}
	
	public void testeObVorletztesElementKorrekteAusrichtungHat() {
		testBrett.fuegeStatischePlattenEin();
		assertEquals(new Kurve(Ausrichtung.KURVEOBENLINKS).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(48).getAusrichtung());
	}
	
	public void testeObDrittesElementKorrekteAusrichtungHat() {
		testBrett.fuegeStatischePlattenEin();
		assertEquals(new Kreuzung(Ausrichtung.KREUZUNGUNTEN).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(2).getAusrichtung());
	}
	
	public void testeSpielfigurPlatziert(){
		testBrett.fuegeStatischePlattenEin();
		testBrett.verteileSpielfiguren(testSpieler);
		assertNotNull(testSpieler.get(0).getSpielfigur().getSpielplatte());
		assertNotNull(testSpieler.get(1).getSpielfigur().getSpielplatte());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
