package com.dhbw.dvst.models;

public class Kreuzung extends Spielplatte{

	public Kreuzung() {
		super();
	}
	
	public Kreuzung(Ausrichtung ausrichtung) {
		super(ausrichtung);
	}
	
	@Override
	protected void fuelleAusrichtungsArray() {
		this.ausrichtungsArray = new Ausrichtung[4];
		this.ausrichtungsArray[0] = Ausrichtung.KREUZUNGLINKS;
		this.ausrichtungsArray[1] = Ausrichtung.KREUZUNGOBEN;
		this.ausrichtungsArray[2] = Ausrichtung.KREUZUNGRECHTS;
		this.ausrichtungsArray[3] = Ausrichtung.KREUZUNGUNTEN;
	}
	
	public void dreheSpielplatteNachRechts() {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			this.ausrichtung = Ausrichtung.KREUZUNGOBEN;
		} else if(ausrichtung == Ausrichtung.KREUZUNGOBEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
		}
	}
	
	public void dreheSpielplatteNachLinks() {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
		} else if(ausrichtung == Ausrichtung.KREUZUNGUNTEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGOBEN;
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
		}
	}

}
