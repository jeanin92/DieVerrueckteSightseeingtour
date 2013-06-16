package com.dhbw.dvst.models;

public class Spieler {

	private String name;
	private Spielfigur spielfigur;
	private Sehenswuerdigkeit ziel;
	private boolean anDerReihe;
	private int fortschritt;

	public Spieler(String name, Spielfigur spielfigur) {
		this.name = name;
		this.spielfigur = spielfigur;
		this.anDerReihe = false;
		this.fortschritt = 0;
	}
	
	public String toString() {
		return this.name;
	}
	
	public Spielfigur getSpielfigur() {
		return spielfigur;
	}

	public void setSpielfigur(Spielfigur spielfigur) {
		this.spielfigur = spielfigur;
		this.spielfigur.setVergeben(true);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isAnDerReihe() {
		return anDerReihe;
	}

	public void setAnDerReihe(boolean anDerReihe) {
		this.anDerReihe = anDerReihe;
	}
	
	public int getFortschritt() {
		return fortschritt;
	}
}
