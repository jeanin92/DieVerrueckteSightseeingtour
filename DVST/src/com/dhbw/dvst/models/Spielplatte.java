package com.dhbw.dvst.models;

import java.util.Random;


public abstract class Spielplatte {

	protected Ausrichtung ausrichtung;
	protected Ausrichtung[] ausrichtungsArray;
	protected String motivURL;
	protected Spielfigur figur;
	protected Sehenswuerdigkeit ziel;
	protected boolean schiebbar;

	public Spielplatte() {
		fuelleAusrichtungsArray();
		this.ausrichtung = randomizeAusrichtung();
		this.schiebbar = false;
		this.figur = null;
	}
	
	public Spielplatte(Ausrichtung ausrichtung) {
		fuelleAusrichtungsArray();
		this.ausrichtung = ausrichtung;
		this.schiebbar = false;
		this.figur = null;
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
	
	public Spielfigur getFigur() {
		return figur;
	}
	
	public void setFigur(Spielfigur figur) {
		this.figur = figur;
	}
	
	public Sehenswuerdigkeit getZiel() {
		return ziel;
	}
	
	public void setZiel(Sehenswuerdigkeit ziel) {
		this.ziel = ziel;
	}
	
	public void setSchiebbar(boolean schiebbar) {
		this.schiebbar = schiebbar;
	}
	
	public boolean isSchiebbar() {
		return schiebbar;
	}
	
	public boolean isUntenOffen() {
		if(getAusrichtung() == Ausrichtung.GERADESENKRECHT) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KURVEUNTENLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KURVEUNTENRECHTS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGRECHTS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGUNTEN) {
			return true;
		}
		return false;
	}
	
	public boolean isObenOffen() {
		if(getAusrichtung() == Ausrichtung.GERADESENKRECHT) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KURVEOBENLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KURVEOBENRECHTS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGRECHTS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGOBEN) {
			return true;
		}
		return false;
	}
	
	public boolean isLinksOffen() {
		if(getAusrichtung() == Ausrichtung.GERADEWAAGERECHT) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KURVEOBENLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KURVEUNTENLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGLINKS) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGUNTEN) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGOBEN) {
			return true;
		}
		return false;
	}
	
	public boolean isRechtsOffen() {
		if(getAusrichtung() == Ausrichtung.GERADEWAAGERECHT) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KURVEOBENRECHTS) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KURVEUNTENRECHTS) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KREUZUNGRECHTS) {
			return true;
		}
		if(getAusrichtung() == Ausrichtung.KREUZUNGUNTEN) {
			return true;
		}
		if (getAusrichtung() == Ausrichtung.KREUZUNGOBEN) {
			return true;
		}
		return false;
	}
}
