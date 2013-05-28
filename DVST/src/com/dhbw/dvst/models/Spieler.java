package com.dhbw.dvst.models;

public class Spieler {

	private String name;
	private Spielfigur spielfigur;
	private Spielkarte spielkarte;
	
	public Spieler(String name, Spielfigur spielfigur) {
		this.name = name;
		this.spielfigur = spielfigur;
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

	public Spielkarte getSpielkarte() {
		return spielkarte;
	}

	public void setSpielkarte(Spielkarte spielkarte) {
		this.spielkarte = spielkarte;
	}
}
