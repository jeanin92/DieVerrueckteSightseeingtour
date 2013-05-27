package com.dhbw.dvst.unittests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.dhbw.dvst.model.Farbe;
import com.dhbw.dvst.model.Form;
import com.dhbw.dvst.model.Spieler;
import com.dhbw.dvst.model.Spielfigur;

import junit.framework.TestCase;

public class SpielerTest extends TestCase {

	private Spieler spieler;
	private Spielfigur figur;
	
	public SpielerTest(String name) {
		super(name);
	}
	
	@Test
	public void testObSpielfigurAlsVergebenMarkiertIst() {
		this.spieler.setSpielfigur(figur);
		assertTrue(this.spieler.getSpielfigur().isVergeben());
	}
	
	@Before
	protected void setUp() throws Exception {
		super.setUp();
		Form form = new Form("auto", "car");
		Farbe farbe = new Farbe("blau", "blue");
		this.figur = new Spielfigur(form, farbe, "");
		this.spieler = new Spieler("Ich", figur);
	}

	@After
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
