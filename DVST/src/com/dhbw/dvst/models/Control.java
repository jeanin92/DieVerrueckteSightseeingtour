package com.dhbw.dvst.models;

public class Control {
	private static Spiel spiel = null;
	
	public static Spiel getInstance(){
		if(spiel==null){
			spiel = new Spiel();
		}
		return spiel;
	}
	
	public static void resetInstance(){
		spiel = new Spiel();
	}
}
