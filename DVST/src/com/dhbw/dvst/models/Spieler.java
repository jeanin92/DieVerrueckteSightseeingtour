package com.dhbw.dvst.models;

public class Spieler {

	private String name;
	private Spielfigur spielfigur;
	private Sehenswuerdigkeit ziel;
	
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
}
