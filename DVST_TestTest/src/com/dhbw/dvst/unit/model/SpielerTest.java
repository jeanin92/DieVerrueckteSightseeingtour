package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;

import junit.framework.TestCase;

public class SpielerTest extends TestCase {

	private Spieler spieler;
	private Spielfigur figur;
	
	public SpielerTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		Form form = new Form("auto", "car");
		Farbe farbe = new Farbe("blau", "blue");
		this.figur = new Spielfigur(form, farbe, "");
		this.spieler = new Spieler("Ich", figur);
	}
	
	public void testObSpielfigurAlsVergebenMarkiertIst() {
		this.spieler.setSpielfigur(figur);
		assertTrue(this.spieler.getSpielfigur().isVergeben());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
