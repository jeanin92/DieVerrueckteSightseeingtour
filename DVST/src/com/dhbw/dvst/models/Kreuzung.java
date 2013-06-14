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
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KREUZUNGOBEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
			setzeOffeneSeiten();
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
			setzeOffeneSeiten();
		}
	}
	
	public void dreheSpielplatteNachLinks() {
		if(ausrichtung == Ausrichtung.KREUZUNGLINKS) {
			this.ausrichtung = Ausrichtung.KREUZUNGUNTEN;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KREUZUNGUNTEN) {
			this.ausrichtung = Ausrichtung.KREUZUNGRECHTS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KREUZUNGRECHTS) {
			this.ausrichtung = Ausrichtung.KREUZUNGOBEN;
			setzeOffeneSeiten();
		} else {
			this.ausrichtung = Ausrichtung.KREUZUNGLINKS;
			setzeOffeneSeiten();
		}
	}

	public void setzeOffeneSeiten() {
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
