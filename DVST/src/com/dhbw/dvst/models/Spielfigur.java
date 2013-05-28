package com.dhbw.dvst.models;

public class Spielfigur {

	private Form form;
	private Farbe farbe;
	private String motivUrl;
	private Spielplatte spielplatte;
	private boolean vergeben;
	
	public Spielfigur(Form form, Farbe farbe, String motivUrl) {
		this.form = form;
		this.farbe = farbe;
		this.motivUrl = motivUrl;
		this.vergeben = false;
	}
	
	public Form getForm() {
		return form;
	}
	public void setForm(Form form) {
		this.form = form;
	}
	public Farbe getFarbe() {
		return farbe;
	}
	public void setFarbe(Farbe farbe) {
		this.farbe = farbe;
	}
	public String getMotivUrl() {
		return motivUrl;
	}
	public void setMotivUrl(String motivUrl) {
		this.motivUrl = motivUrl;
	}
	public Spielplatte getSpielplatte() {
		return spielplatte;
	}
	public void setSpielplatte(Spielplatte spielplatte) {
		this.spielplatte = spielplatte;
	}

	public boolean isVergeben() {
		return vergeben;
	}

	public void setVergeben(boolean vergeben) {
		this.vergeben = vergeben;
	}
}
