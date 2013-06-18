package com.dhbw.dvst.models;

import java.util.Random;


public abstract class Spielplatte {

	protected Ausrichtung ausrichtung;
	protected Ausrichtung[] ausrichtungsArray;
	protected String motivURL;
	protected Spielfigur figur;
	protected Sehenswuerdigkeit ziel;
	protected boolean schiebbar;
	protected boolean obenOffen;
	protected boolean rechtsOffen;
	protected boolean untenOffen;
	protected boolean linksOffen;

	public Spielplatte() {
		fuelleAusrichtungsArray();
		this.ausrichtung = randomizeAusrichtung();
		setzeOffeneSeiten();
		this.schiebbar = false;
		this.figur = null;
	}
	
	public Spielplatte(Ausrichtung ausrichtung) {
		fuelleAusrichtungsArray();
		this.ausrichtung = ausrichtung;
		setzeOffeneSeiten();
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
	public abstract void setzeOffeneSeiten();

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

	public boolean isObenOffen() {
		return obenOffen;
	}

	public void setObenOffen(boolean obenOffen) {
		this.obenOffen = obenOffen;
	}

	public boolean isRechtsOffen() {
		return rechtsOffen;
	}

	public void setRechtsOffen(boolean rechtsOffen) {
		this.rechtsOffen = rechtsOffen;
	}

	public boolean isUntenOffen() {
		return untenOffen;
	}

	public void setUntenOffen(boolean untenOffen) {
		this.untenOffen = untenOffen;
	}

	public boolean isLinksOffen() {
		return linksOffen;
	}

	public void setLinksOffen(boolean linksOffen) {
		this.linksOffen = linksOffen;
	}
}
