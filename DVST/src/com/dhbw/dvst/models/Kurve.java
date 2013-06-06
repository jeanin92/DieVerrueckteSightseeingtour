package com.dhbw.dvst.models;

public class Kurve extends Spielplatte{
	
	public Kurve(Ausrichtung ausrichtung) {
		this.ausrichtung = ausrichtung;
	}
	
	public Kurve() {
		this.ausrichtungsArray[0] = Ausrichtung.KURVEOBENLINKS;
		this.ausrichtungsArray[1] = Ausrichtung.KURVEOBENRECHTS;
		this.ausrichtungsArray[2] = Ausrichtung.KURVEUNTENLINKS;
		this.ausrichtungsArray[3] = Ausrichtung.KURVEUNTENRECHTS;
		this.ausrichtung = randomizeAusrichtung();
	}

	protected void dreheSpielplatteNachRechts(Ausrichtung ausrichtung) {
		if(ausrichtung == Ausrichtung.KURVEOBENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEOBENRECHTS;
		} else if(ausrichtung == Ausrichtung.KURVEOBENRECHTS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENRECHTS;
		} else if(ausrichtung == Ausrichtung.KURVEUNTENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEOBENLINKS;
		} else {
			this.ausrichtung = Ausrichtung.KURVEUNTENLINKS;
		}
	}
	
	protected void dreheSpielplatteNachLinks(Ausrichtung ausrichtung) {
		if(ausrichtung == Ausrichtung.KURVEOBENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENLINKS;
		} else if(ausrichtung == Ausrichtung.KURVEOBENRECHTS) {
			this.ausrichtung = Ausrichtung.KURVEOBENLINKS;
		} else if(ausrichtung == Ausrichtung.KURVEUNTENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENRECHTS;
		} else {
			this.ausrichtung = Ausrichtung.KURVEOBENRECHTS;
		}
	}
}
