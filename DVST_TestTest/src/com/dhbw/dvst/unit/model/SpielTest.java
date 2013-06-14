package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;

import junit.framework.TestCase;

public class SpielTest extends TestCase{
	private Spieler hannah;

	public SpielTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		hannah = new Spieler("HANNAH", new Spielfigur(
				new Form("bus", "bus"), new Farbe("blue", "blau"), "bus_blue"));
		Spiel.getInstance().spielerHinzufuegen(hannah);
	}
	
	public void testObSpielerHinzufuegenGenauEinenNeuenSpielerAnlegt() {
		assertEquals(1, Spiel.getInstance().getAlleSpieler().size());
	}
	
	public void testObSpielerHinzufuegenNeuenSpielerAnlegt() {
		assertEquals(hannah, Spiel.getInstance().getAlleSpieler().get(0));
	}
	
	public void testObSpielerHinzufuegenSpielfigurMitMotivSetzt() {
		assertEquals("bus_blue", Spiel.getInstance().getAlleSpieler().get(0).getSpielfigur().getMotivUrl());
	}
	
	public void testObSpielerHinzufuegenSpielfigurMitMotivAufVergebenSetzt() {
		assertEquals(true, Spiel.getInstance().getAlleSpieler().get(0).getSpielfigur().isVergeben());
	}
	
	public void testObSpielerLoeschenEinzigenSpielerLoescht() {
		Spiel.getInstance().spielerLoeschen(hannah);
		assertEquals(true, Spiel.getInstance().getAlleSpieler().isEmpty());
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
		Spiel.resetInstance();
	}
}
