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
	
	@Override
	protected void setUp() throws Exception {
		super.setUp();
	}
	
	public void testObNachRechtsDrehenBeiGeradeOeffnungenkorrektSetzt() {
	}
	
	public void testObNachLinksDrehenBeiKurveOeffnungenkorrektSetzt() {
	}
	
	public void testObZweimalNachLinksDrehenBeiKreuzungOeffnungenkorrektSetzt() {
	}
	
	public void testObEinmalNachLinksUndNachRechtsDrehenBeiKurveOeffnungenkorrektSetzt() {
	}
	
	@Override
	protected void tearDown() throws Exception {
		super.tearDown();
	}

}
