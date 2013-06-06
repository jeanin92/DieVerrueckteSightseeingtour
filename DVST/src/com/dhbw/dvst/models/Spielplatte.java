package com.dhbw.dvst.models;

import java.util.Random;


public class Spielplatte {
	
private boolean obenOffen;
private boolean rechtsOffen;
private boolean untenOffen;
private boolean linksOffen;

	protected Ausrichtung ausrichtung;
	protected Ausrichtung[] ausrichtungsArray;
	protected int randomIndex;
	
	public Spielplatte(Ausrichtung ausrichtung) {
		this.ausrichtung = ausrichtung;
	}
	
	public Spielplatte() {
	}
	
	protected Ausrichtung randomizeAusrichtung() {
		Random randomizer = new Random();
		randomIndex = randomizer.nextInt(ausrichtungsArray.length);
		return this.ausrichtungsArray[randomIndex];
	}
	
	protected Ausrichtung dreheSpielplatteNachRechts();
}
