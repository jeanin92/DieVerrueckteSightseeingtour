package com.dhbw.dvst.models;

public class Ablauf {
	private boolean karteZiehen;
	private boolean platteEinschieben;
	private boolean figurZiehen;
	
	public Ablauf() {
		this.karteZiehen = true;
		this.platteEinschieben = false;
		this.figurZiehen = false;
	}
	
	public void karteGezogen(){
		this.karteZiehen = false;
		this.platteEinschieben = true;
	}
	
	public void platteEingeschoben(){
		this.platteEinschieben = false;
		this.figurZiehen = true;
	}
	
	public void spielzugFertig(){
		this.figurZiehen = false;
		this.karteZiehen = true;
	}

}
