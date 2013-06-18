package com.dhbw.dvst.unit.utilities;

import java.util.ArrayList;

import junit.framework.TestCase;

import com.dhbw.dvst.models.Farbe;
import com.dhbw.dvst.models.Form;
import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.models.Spielplatte;
import com.dhbw.dvst.utilities.SpielplattenEinschieber;

public class SpielplattenEinschieberTest extends TestCase{

	private SpielplattenEinschieber schieber;
	private Spielbrett testBrett;
	private ArrayList<Spieler> testSpieler = new ArrayList<Spieler>();

	public SpielplattenEinschieberTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		testBrett = new Spielbrett();
		testSpieler.add(new Spieler("test1", new Spielfigur(new Form("auto", "car"), new Farbe("rot", "red"), "car_red")));
		testSpieler.add(new Spieler("test2", new Spielfigur(new Form("auto", "car"), new Farbe("blau", "blue"), "car_blue")));
		testBrett.fuelleLosesSpielplattenArray();
		schieber = new SpielplattenEinschieber();
		schieber.initSpielplattenEinschieber(testBrett);
	}
	
	public void testObSpielplattenAktualisierenSchiebbarKorrektSetzt() {
		testBrett.fuegeStatischePlattenEin();
		schieber.aktualisiereSchiebbarePlatten(43, 8);
		assertEquals(true, testBrett.getAlleSpielplatten().get(43).isSchiebbar());
	}
	
	public void testObSpielplattenAktualisierenSchiebbarKorrektLoescht() {
		testBrett.fuegeStatischePlattenEin();
		schieber.aktualisiereSchiebbarePlatten(43, 8);
		assertEquals(false, testBrett.getAlleSpielplatten().get(8).isSchiebbar());
	}
	
	public void testObAktualisiereAktivePlatteEingeschobenePlatteKorrektSetzt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte alteAktivePlatte = testBrett.getAktivePlatte();
		Spielplatte neueAktivePlatte = testBrett.getAlleSpielplatten().get(45);
		schieber.aktualisiereAktivePlatte(3, neueAktivePlatte);
		assertEquals(alteAktivePlatte, testBrett.getAlleSpielplatten().get(3));
	}
	
	public void testObAktualisiereAktivePlatteKorrektePlatteSetzt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte raus = testBrett.getAlleSpielplatten().get(45);
		schieber.aktualisiereAktivePlatte(3, raus);
		assertEquals(raus, testBrett.getAktivePlatte());
	}
	
	public void testObSpielplatteLinksEinschiebenKorrekteMengeAnSpielplattenBehaelt() {
		testBrett.fuegeStatischePlattenEin();
		schieber.spielplatteLinksEinschieben(35);
		assertEquals(49, testBrett.getAlleSpielplatten().size());
	}
	
	public void testObSpielplatteLinksEinschiebenKorrektePlatteRausschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte raus = testBrett.getAlleSpielplatten().get(27);
		schieber.spielplatteLinksEinschieben(21);
		assertEquals(raus, testBrett.getAktivePlatte());
	}
	
	public void testObSpielplatteLinksEinschiebenAktivePlatteAnkorrekterPositionEinschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte aktiv = testBrett.getAktivePlatte();
		schieber.spielplatteLinksEinschieben(7);
		assertEquals(aktiv, testBrett.getAlleSpielplatten().get(7));
	}
	
	public void testObSpielplatteRechtsEinschiebenKorrektePlatteRausschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte raus = testBrett.getAlleSpielplatten().get(7);
		schieber.spielplatteRechtsEinschieben(13);
		assertEquals(raus, testBrett.getAktivePlatte());
	}
	
	public void testObSpielplatteRechtsEinschiebenAktivePlatteAnkorrekterPositionEinschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte aktiv = testBrett.getAktivePlatte();
		schieber.spielplatteRechtsEinschieben(41);
		assertEquals(aktiv, testBrett.getAlleSpielplatten().get(41));
	}
	
	public void testObSpielplatteObenEinschiebenKorrektePlatteRausschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte raus = testBrett.getAlleSpielplatten().get(45);
		schieber.spielplatteObenEinschieben(3);
		assertEquals(raus, testBrett.getAktivePlatte());
	}
	
	public void testObSpielplatteObenEinschiebenAktivePlatteAnkorrekterPositionEinschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte aktiv = testBrett.getAktivePlatte();
		schieber.spielplatteObenEinschieben(1);
		assertEquals(aktiv, testBrett.getAlleSpielplatten().get(1));
	}
	
	public void testObSpielplatteObenEinschiebenDieViertePlatteKorrektWeiterschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos24 = testBrett.getAlleSpielplatten().get(24);
		schieber.spielplatteObenEinschieben(3);
		assertEquals(altePlattePos24, testBrett.getAlleSpielplatten().get(31));
	}
	
	public void testObSpielplatteUntenEinschiebenKorrektePlatteRausschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte raus = testBrett.getAlleSpielplatten().get(5);
		schieber.spielplatteUntenEinschieben(47);
		assertEquals(raus, testBrett.getAktivePlatte());
	}
	
	public void testObSpielplatteUntenEinschiebenAktivePlatteAnKorrekterPositionEinschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte aktiv = testBrett.getAktivePlatte();
		schieber.spielplatteUntenEinschieben(43);
		assertEquals(aktiv, testBrett.getAlleSpielplatten().get(43));
	}
	
	public void testObSpielplatteUntenEinschiebenDieDrittePlatteKorrektWeiterschiebt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos31 = testBrett.getAlleSpielplatten().get(31);
		schieber.spielplatteUntenEinschieben(45);
		assertEquals(altePlattePos31, testBrett.getAlleSpielplatten().get(24));
	}
	
	public void testObSpielplatteEinschiebenLinksWaehlt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos24 = testBrett.getAlleSpielplatten().get(24);
		schieber.spielplatteEinschieben(testBrett.getAlleSpielplatten().get(21));
		assertEquals(altePlattePos24, testBrett.getAlleSpielplatten().get(25));
	}
	
	public void testObSpielplatteEinschiebenRechtsWaehlt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos24 = testBrett.getAlleSpielplatten().get(24);
		schieber.spielplatteEinschieben(testBrett.getAlleSpielplatten().get(27));
		assertEquals(altePlattePos24, testBrett.getAlleSpielplatten().get(23));
	}
	
	public void testObSpielplatteEinschiebenObenWaehlt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos24 = testBrett.getAlleSpielplatten().get(24);
		schieber.spielplatteEinschieben(testBrett.getAlleSpielplatten().get(3));
		assertEquals(altePlattePos24, testBrett.getAlleSpielplatten().get(31));
	}
	
	public void testObSpielplatteEinschiebenUntenWaehlt() {
		testBrett.fuegeStatischePlattenEin();
		Spielplatte altePlattePos24 = testBrett.getAlleSpielplatten().get(24);
		schieber.spielplatteEinschieben(testBrett.getAlleSpielplatten().get(45));
		assertEquals(altePlattePos24, testBrett.getAlleSpielplatten().get(17));
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}
}
