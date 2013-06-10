package com.dhbw.dvst.models;

import java.util.Random;


public abstract class Spielplatte {

	protected Ausrichtung ausrichtung;
	protected Ausrichtung[] ausrichtungsArray;
	protected String motivURL;
	protected Spielfigur figur;
	protected boolean schiebbar;
	
	public Spielplatte() {
		fuelleAusrichtungsArray();
		this.ausrichtung = randomizeAusrichtung();
		this.schiebbar = false;
	}
	
	public Spielplatte(Ausrichtung ausrichtung) {
		fuelleAusrichtungsArray();
		this.ausrichtung = ausrichtung;
	}
	
	protected abstract void fuelleAusrichtungsArray();
	
	protected Ausrichtung randomizeAusrichtung() {
		Random randomizer = new Random();
		int randomIndex = randomizer.nextInt(ausrichtungsArray.length);
		return this.ausrichtungsArray[randomIndex];
	}
	
	public Ausrichtung getAusrichtung() {
		return ausrichtung;
	}
	
	public Ausrichtung[] getAusrichtungsArray() {
		return ausrichtungsArray;
	}
	
	public abstract void dreheSpielplatteNachLinks();
	public abstract void dreheSpielplatteNachRechts();

	public String getMotivURL() {
		return motivURL;
	}
}
