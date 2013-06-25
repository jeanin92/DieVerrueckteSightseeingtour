package com.dhbw.dvst.utilities;

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
	
	public boolean isFigurZiehen() {
		return figurZiehen;
	}
	
	public boolean isKarteZiehen() {
		return karteZiehen;
	}
	
	public boolean isPlatteEinschieben() {
		return platteEinschieben;
	}
}
