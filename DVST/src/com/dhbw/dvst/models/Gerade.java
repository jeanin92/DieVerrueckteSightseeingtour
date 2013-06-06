package com.dhbw.dvst.models;

public class Gerade extends Spielplatte{
	
	public Gerade(Ausrichtung ausrichtung) {
		this.ausrichtung = ausrichtung;
	}
	
	public Gerade() {
		this.ausrichtungsArray[0] = Ausrichtung.GERADESENKRECHT;
		this.ausrichtungsArray[1] = Ausrichtung.GERADEWAAGERECHT;
		this.ausrichtung = randomizeAusrichtung();
	}
	
	protected void dreheSpielplatteNachRechts(Ausrichtung ausrichtung) {
		if(ausrichtung == Ausrichtung.GERADESENKRECHT) {
			this.ausrichtung = Ausrichtung.GERADEWAAGERECHT;
		} else {
			this.ausrichtung = Ausrichtung.GERADESENKRECHT;
		}
	}
	
	protected void dreheSpielplatteNachLinks(Ausrichtung ausrichtung) {
		dreheSpielplatteNachRechts(ausrichtung);
	}

}
