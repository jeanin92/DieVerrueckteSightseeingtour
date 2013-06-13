package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;

import junit.framework.TestCase;

public class SpielTest extends TestCase{

	private Spiel spiel;

	public SpielTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		spiel = Spiel.getInstance();
	}
	
	public void testObSpielerHinzufuegenNeuenSpielerAnlegt() {
		Spieler hannah = new Spieler("HANNAH", new Spielfigur(
				new Form("bus", "bus"), new Farbe("blue", "blau"), "bus_blue"));
		spiel.spielerHinzufuegen(hannah);
		assertEquals(hannah, spiel.getAlleSpieler().get(0));
	}
	
	public void testObSpielerHinzufuegenSpielfigurMitMotivSetzt() {
		Spieler hannah = new Spieler("HANNAH", new Spielfigur(
				new Form("bus", "bus"), new Farbe("blue", "blau"), "bus_blue"));
		spiel.spielerHinzufuegen(hannah);
		assertEquals("bus_blue", spiel.getAlleSpieler().get(0).getSpielfigur().getMotivUrl());
	}
	
	public void testObSpielerHinzufuegenSpielfigurMitMotivAufVergebenSetzt() {
		Spieler hannah = new Spieler("HANNAH", new Spielfigur(
				new Form("bus", "bus"), new Farbe("blue", "blau"), "bus_blue"));
		spiel.spielerHinzufuegen(hannah);
		assertEquals(true, spiel.getAlleSpieler().get(0).getSpielfigur().isVergeben());
	}
	
	public void testObSpielerLoeschenEinzigenSpielerLoescht() {
		Spieler hannah = new Spieler("HANNAH", new Spielfigur(
				new Form("bus", "bus"), new Farbe("blue", "blau"), "bus_blue"));
		spiel.spielerLoeschen(hannah);
		assertEquals(true, spiel.getAlleSpieler().isEmpty());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
