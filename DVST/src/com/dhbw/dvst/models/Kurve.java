package com.dhbw.dvst.models;

public class Kurve extends Spielplatte{
	
	public Kurve(Ausrichtung ausrichtung) {
		super(ausrichtung);
	}
	
	public Kurve() {
		super();
	}

	public void dreheSpielplatteNachRechts() {
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
	
	public void dreheSpielplatteNachLinks() {
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

	@Override
	protected void fuelleAusrichtungsArray() {
		this.ausrichtungsArray = new Ausrichtung[4];
		this.ausrichtungsArray[0] = Ausrichtung.KURVEOBENLINKS;
		this.ausrichtungsArray[1] = Ausrichtung.KURVEOBENRECHTS;
		this.ausrichtungsArray[2] = Ausrichtung.KURVEUNTENLINKS;
		this.ausrichtungsArray[3] = Ausrichtung.KURVEUNTENRECHTS;
	}
}
