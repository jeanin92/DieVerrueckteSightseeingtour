package com.dhbw.dvst.models;

public class Kreuzung extends Spielplatte{

	public Kreuzung(Ausrichtung ausrichtung) {
		this.ausrichtung = ausrichtung;
	}
	
	public Kreuzung() {
		this.ausrichtungsArray[0] = Ausrichtung.KREUZUNGLINKS;
		this.ausrichtungsArray[1] = Ausrichtung.KREUZUNGOBEN;
		this.ausrichtungsArray[2] = Ausrichtung.KREUZUNGRECHTS;
		this.ausrichtungsArray[3] = Ausrichtung.KREUZUNGUNTEN;
		this.ausrichtung = randomizeAusrichtung();
	}
	
	protected void dreheSpielplatteNachRechts(Ausrichtung ausrichtung) {
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
	
	protected void dreheSpielplatteNachLinks() {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
		} else if(ausrichtung == Ausrichtung.KREUZUNGOBEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
		} else if(ausrichtung == Ausrichtung.KREUZUNGOBEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
		}
	}

}
