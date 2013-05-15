package com.dhbw.dvst.model;

public class Spielfigur {

	private String form;
	private String farbe;
	private String motivUrl;
	private Spielplatte spielplatte;
	private boolean vergeben;
	
	/**
	 * Konstruktor
	 * @param String form
	 * @param String farbe
	 * @param String motivUrl URL der Spielfigur
	 */
	public Spielfigur(String form, String farbe, String motivUrl) {
		this.form = form;
		this.farbe = farbe;
		this.motivUrl = motivUrl;
		this.vergeben = false;
	}
	
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getFarbe() {
		return farbe;
	}
	public void setFarbe(String farbe) {
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
