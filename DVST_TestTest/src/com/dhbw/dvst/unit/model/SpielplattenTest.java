package com.dhbw.dvst.unit.model;

import com.dhbw.dvst.models.Spielplatte;

import junit.framework.TestCase;

public class SpielplattenTest extends TestCase {
	
	private Spielplatte gerade;
	private Spielplatte kurve;
	private Spielplatte kreuzung;

	public SpielplattenTest(String name) {
		super(name);
	}
	
	protected void setUp() throws Exception {
		super.setUp();
		this.gerade = new Spielplatte(true, false, true, false);
		this.kurve = new Spielplatte(true, true, false, false);
		this.kreuzung = new Spielplatte(false, true, true, true);
	}
	
	public void testObNachRechtsDrehenBeiGeradeOeffnungenkorrektSetzt() {
		this.gerade.nachRechtsDrehen();
		assertEquals(this.gerade.isObenOffen(), false);
		assertEquals(this.gerade.isRechtsOffen(), true);
		assertEquals(this.gerade.isUntenOffen(), false);
		assertEquals(this.gerade.isLinksOffen(), true);
	}
	
	public void testObNachLinksDrehenBeiKurveOeffnungenkorrektSetzt() {
		this.kurve.nachLinksDrehen();
		assertEquals(this.kurve.isObenOffen(), true);
		assertEquals(this.kurve.isRechtsOffen(), false);
		assertEquals(this.kurve.isUntenOffen(), false);
		assertEquals(this.kurve.isLinksOffen(), true);
	}
	
	public void testObZweimalNachLinksDrehenBeiKreuzungOeffnungenkorrektSetzt() {
		this.kreuzung.nachLinksDrehen();
		this.kreuzung.nachLinksDrehen();
		assertEquals(this.kreuzung.isObenOffen(), true);
		assertEquals(this.kreuzung.isRechtsOffen(), true);
		assertEquals(this.kreuzung.isUntenOffen(), false);
		assertEquals(this.kreuzung.isLinksOffen(), true);
	}
	
	public void testObEinmalNachLinksUndNachRechtsDrehenBeiKurveOeffnungenkorrektSetzt() {
		this.kurve.nachLinksDrehen();
		this.kurve.nachRechtsDrehen();
		assertEquals(this.kurve.isObenOffen(), true);
		assertEquals(this.kurve.isRechtsOffen(), true);
		assertEquals(this.kurve.isUntenOffen(), false);
		assertEquals(this.kurve.isLinksOffen(), false);
	}
	
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
