package com.dhbw.dvst.model;

public class Spieler {

	private String name;
	private Spielfigur spielfigur;
	private Spielkarte spielkarte;
	
	public Spieler(String name, Spielfigur spielfigur) {
		this.name = name;
		this.spielfigur = spielfigur;
	}

	public Spielfigur getSpielfigur() {
		return spielfigur;
	}

	public void setSpielfigur(Spielfigur spielfigur) {
		this.spielfigur = spielfigur;
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
