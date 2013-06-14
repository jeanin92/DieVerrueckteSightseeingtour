package com.dhbw.dvst.models;

public class Kreuzung extends Spielplatte{

	public Kreuzung() {
		super();
		this.motivURL = "kreuzung";
	}
	
	public Kreuzung(Ausrichtung ausrichtung) {
		super(ausrichtung);
		this.motivURL = "kreuzung";
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
			setzeOffeneSeiten(ausrichtung);
		} else if(ausrichtung == Ausrichtung.KREUZUNGOBEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
			setzeOffeneSeiten(ausrichtung);
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
			setzeOffeneSeiten(ausrichtung);
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
			setzeOffeneSeiten(ausrichtung);
		}
	}
	
	public void dreheSpielplatteNachLinks() {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
			setzeOffeneSeiten(ausrichtung);
		} else if(ausrichtung == Ausrichtung.KREUZUNGUNTEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
			setzeOffeneSeiten(ausrichtung);
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGOBEN;
			setzeOffeneSeiten(ausrichtung);
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
			setzeOffeneSeiten(ausrichtung);
		}
	}

	protected void setzeOffeneSeiten(Ausrichtung ausrichtung) {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			setObenOffen(true);
			setUntenOffen(true);
			setLinksOffen(true);
			setRechtsOffen(false);
		} else if (ausrichtung == Ausrichtung.KREUZUNGOBEN){
			setLinksOffen(true);
			setRechtsOffen(true);
			setObenOffen(true);
			setUntenOffen(false);
		} else if (ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			setLinksOffen(false);
			setRechtsOffen(true);
			setObenOffen(true);
			setUntenOffen(true);
		} else {
			setLinksOffen(true);
			setRechtsOffen(true);
			setObenOffen(false);
			setUntenOffen(true);
		}
	}
}
