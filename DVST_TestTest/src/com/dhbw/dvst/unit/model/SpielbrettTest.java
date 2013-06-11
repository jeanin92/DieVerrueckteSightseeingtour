package com.dhbw.dvst.unit.model;

import java.util.ArrayList;
import java.util.Stack;

import junit.framework.TestCase;

import com.dhbw.dvst.models.Ausrichtung;
import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Kreuzung;
import com.dhbw.dvst.models.Kurve;
import com.dhbw.dvst.models.Sehenswuerdigkeit;
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
	}
	
	public void testObLosesSpielPlattenArrayKorrekteLaengeHat() {
		testBrett.fuelleLosesSpielplattenArray();
		assertEquals(34, testBrett.getAlleSpielplatten().size());
	}
	
	public void testObSpielplattenArrayKorrekteLaengeHat() {
		testBrett.fuelleLosesSpielplattenArray();
		testBrett.fuegeStatischePlattenEin();
		assertEquals(50, this.testBrett.getAlleSpielplatten().size());	
	}
	
	public void testeVorletztesElement() {
		testBrett.fuelleLosesSpielplattenArray();
		testBrett.fuegeStatischePlattenEin();
		assertEquals(new Kurve(Ausrichtung.KURVEOBENLINKS).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(48).getAusrichtung());
	}
	
	public void testeDrittesElement() {
		testBrett.fuelleLosesSpielplattenArray();
		testBrett.fuegeStatischePlattenEin();
		assertEquals(new Kreuzung(Ausrichtung.KREUZUNGUNTEN).getAusrichtung(),
				this.testBrett.getAlleSpielplatten().get(2).getAusrichtung());
	}
	
	public void testeSpielfigurPlatziert(){
		testBrett.fuelleLosesSpielplattenArray();
		testBrett.fuegeStatischePlattenEin();
		testBrett.verteileSpielfiguren(testSpieler);
		assertNotNull(testSpieler.get(0).getSpielfigur().getSpielplatte());
		assertNotNull(testSpieler.get(1).getSpielfigur().getSpielplatte());
	}
	
	public void testObMischekartenstapelKorrekteLaengeDesKartenStapelsAufbaut() {
		testBrett.mischeKartenstapel(new Stack<Sehenswuerdigkeit>());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
