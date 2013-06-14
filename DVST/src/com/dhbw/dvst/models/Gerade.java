package com.dhbw.dvst.models;

public class Gerade extends Spielplatte{
	
	public Gerade() {
		super();
		this.motivURL = "gerade";
	}
	
	public Gerade(Ausrichtung ausrichtung) {
		super(ausrichtung);
		this.motivURL = "gerade";
	}
	
	public void dreheSpielplatteNachRechts() {
		if(ausrichtung == Ausrichtung.GERADESENKRECHT) {
			this.ausrichtung = Ausrichtung.GERADEWAAGERECHT;
			setzeOffeneSeiten(ausrichtung);
		} else {
			this.ausrichtung = Ausrichtung.GERADESENKRECHT;
			setzeOffeneSeiten(ausrichtung);
		}
	}
	
	public void dreheSpielplatteNachLinks() {
		dreheSpielplatteNachRechts();
	}

	@Override
	protected void fuelleAusrichtungsArray() {
		this.ausrichtungsArray = new Ausrichtung[2];
		this.ausrichtungsArray[0] = Ausrichtung.GERADESENKRECHT;
		this.ausrichtungsArray[1] = Ausrichtung.GERADEWAAGERECHT;
	}
	
	protected void setzeOffeneSeiten(Ausrichtung ausrichtung) {
		if(ausrichtung == Ausrichtung.GERADESENKRECHT) {
			setObenOffen(true);
			setUntenOffen(true);
			setLinksOffen(false);
			setRechtsOffen(false);
		} else {
			setLinksOffen(true);
			setRechtsOffen(true);
			setObenOffen(false);
			setUntenOffen(false);
		}
	}

}
