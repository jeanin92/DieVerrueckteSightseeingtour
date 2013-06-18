package com.dhbw.dvst.unit.model;

import java.util.ArrayList;

import junit.framework.TestCase;

import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.SpielfigurSetzer;

public class FigurUmsetzerTest extends TestCase{

	private Spielbrett testBrett;
	private ArrayList<Spieler> testSpieler = new ArrayList<Spieler>();
	private SpielfigurSetzer figurSetzer;
	
	public FigurUmsetzerTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		figurSetzer = new SpielfigurSetzer();
		
		testBrett = new Spielbrett();
		testSpieler.add(new Spieler("test1", new Spielfigur(new Form("auto", "car"), new Farbe("rot", "red"), "car_red")));
		testSpieler.add(new Spieler("test2", new Spielfigur(new Form("auto", "car"), new Farbe("blau", "blue"), "car_blue")));
		testBrett.fuelleLosesSpielplattenArray();
	}
	
//	public void testObFigurAufSpielbrettUmsetzenFigurKorrektSetzt() {
//		testBrett.fuegeStatischePlattenEin();
//		Spielfigur figur = new Spielfigur(new Form("auto", "car"), new Farbe("gelb", "yellow"), "car_yellow");
//		this.testBrett.getAktivePlatte().setFigur(figur);
//		this.testBrett.figurSetzen(1);
//		assertEquals(figur, this.testBrett.getAlleSpielplatten().get(1).getFigur());
//	}
//	
//	public void testObFigurUmsetzenFigurAufAktiverPlatteLoescht() {
//		testBrett.fuegeStatischePlattenEin();
//		this.testBrett.getAktivePlatte().setFigur(
//				new Spielfigur(new Form("auto", "car"), new Farbe("gelb", "yellow"), "car_yellow"));
//		this.testBrett.figurUmsetzen(1);
//		assertNull(this.testBrett.getAlleSpielplatten().get(48).getFigur());
//	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
