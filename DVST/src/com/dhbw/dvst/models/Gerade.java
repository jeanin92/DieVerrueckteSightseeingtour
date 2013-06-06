package com.dhbw.dvst.models;

public class Gerade extends Spielplatte{
	
	public Gerade() {
		super();
	}
	
	public Gerade(Ausrichtung ausrichtung) {
		super(ausrichtung);
	}
	
	public void dreheSpielplatteNachRechts() {
		if(ausrichtung == Ausrichtung.GERADESENKRECHT) {
			this.ausrichtung = Ausrichtung.GERADEWAAGERECHT;
		} else {
			this.ausrichtung = Ausrichtung.GERADESENKRECHT;
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

}
