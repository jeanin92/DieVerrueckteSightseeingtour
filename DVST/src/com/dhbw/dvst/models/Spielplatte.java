package com.dhbw.dvst.models;

import java.util.Random;


public abstract class Spielplatte {

	protected Ausrichtung ausrichtung;
	protected Ausrichtung[] ausrichtungsArray;
	protected int randomIndex;
	
	
	public Spielplatte() {
		fuelleAusrichtungsArray();
		this.ausrichtung = randomizeAusrichtung();
	}
	
	public Spielplatte(Ausrichtung ausrichtung) {
		fuelleAusrichtungsArray();
		this.ausrichtung = ausrichtung;
	}
	
	protected abstract void fuelleAusrichtungsArray();
	
	protected Ausrichtung randomizeAusrichtung() {
		Random randomizer = new Random();
		randomIndex = randomizer.nextInt(ausrichtungsArray.length);
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
}
