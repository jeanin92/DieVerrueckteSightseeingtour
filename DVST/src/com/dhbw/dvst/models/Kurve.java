package com.dhbw.dvst.models;

public class Kurve extends Spielplatte{
	
	public Kurve(Ausrichtung ausrichtung) {
		super(ausrichtung);
		this.motivURL = "kurve";
	}
	
	public Kurve() {
		super();
		this.motivURL = "kurve";
	}

	@Override
	public void dreheSpielplatteNachRechts() {
		if(ausrichtung == Ausrichtung.KURVEOBENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEOBENRECHTS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KURVEOBENRECHTS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENRECHTS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KURVEUNTENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEOBENLINKS;
			setzeOffeneSeiten();
		} else {
			this.ausrichtung = Ausrichtung.KURVEUNTENLINKS;
			setzeOffeneSeiten();
		}
	}
	
	@Override
	public void dreheSpielplatteNachLinks() {
		if(ausrichtung == Ausrichtung.KURVEOBENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENLINKS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KURVEOBENRECHTS) {
			this.ausrichtung = Ausrichtung.KURVEOBENLINKS;
			setzeOffeneSeiten();
		} else if(ausrichtung == Ausrichtung.KURVEUNTENLINKS) {
			this.ausrichtung = Ausrichtung.KURVEUNTENRECHTS;
			setzeOffeneSeiten();
		} else {
			this.ausrichtung = Ausrichtung.KURVEOBENRECHTS;
			setzeOffeneSeiten();
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
	
	public void setzeOffeneSeiten() {
		if(ausrichtung == Ausrichtung.KURVEOBENLINKS) {
			setObenOffen(true);
			setUntenOffen(false);
			setLinksOffen(true);
			setRechtsOffen(false);
		} else if (ausrichtung == Ausrichtung.KURVEOBENRECHTS){
			setLinksOffen(false);
			setRechtsOffen(true);
			setObenOffen(true);
			setUntenOffen(false);
		} else if (ausrichtung == Ausrichtung.KURVEUNTENLINKS) {
			setLinksOffen(true);
			setRechtsOffen(false);
			setObenOffen(false);
			setUntenOffen(true);
		} else if (ausrichtung == Ausrichtung.KURVEUNTENRECHTS){
			setLinksOffen(false);
			setRechtsOffen(true);
			setObenOffen(false);
			setUntenOffen(true);
		}
	}
}
