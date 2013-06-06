package com.dhbw.dvst.models;

import java.util.ArrayList;
import java.util.Random;

public class Spielbrett {
	
	public static final int kurve = 0;
	public static final int gerade = 1;
	public static final int kreuzung = 2;
	
	private ArrayList<Spielplatte> alleSpielplatten;
	private ArrayList<Integer> unsortiertesIntPlattenArray = new ArrayList<Integer>();
	private Random plattenRandomizer = new Random();

	public Spielbrett(ArrayList<Spielplatte> alleSpielplatten) {
		this.alleSpielplatten = alleSpielplatten;
		fuelleLosesSpielplattenArray();
		fuegeStatischePlattenEin();
	}

	protected void fuelleLosesSpielplattenArray() {
		unsortiertesIntPlattenArray = baueIntArrayMitAnzahlVerschiedenerPlatten();
		int randomElementIndex;
		int randomElementWert;
		
		while(!unsortiertesIntPlattenArray.isEmpty()) {
			randomElementIndex = plattenRandomizer.nextInt(unsortiertesIntPlattenArray.size());
			randomElementWert = unsortiertesIntPlattenArray.get(randomElementIndex);
			try {			
				if(randomElementWert == 0) {
					alleSpielplatten.add(new Kurve());
				} else if(randomElementWert == 1) {
					alleSpielplatten.add(new Gerade());
				} else if(randomElementWert == 2) {
					alleSpielplatten.add(new Kreuzung());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			unsortiertesIntPlattenArray.remove(randomElementIndex);
		}
	}
	
	protected ArrayList<Integer> baueIntArrayMitAnzahlVerschiedenerPlatten() {
		unsortiertesIntPlattenArray = new ArrayList<Integer>();
		
		for(int kurve = 0; kurve < 15; kurve++) {
			unsortiertesIntPlattenArray.add(0);
		}
		for(int gerade = 0; gerade < 13; gerade++) {
			unsortiertesIntPlattenArray.add(1);
		}
		for(int kreuzung = 0; kreuzung < 6; kreuzung++) {
			unsortiertesIntPlattenArray.add(2);
		}
		return unsortiertesIntPlattenArray;
	}
	
	protected void fuegeStatischePlattenEin() {
		
		//Reihe 1
		alleSpielplatten.add(0, new Kurve(Ausrichtung.KURVEUNTENRECHTS));
		alleSpielplatten.add(2, new Kreuzung(Ausrichtung.KREUZUNGUNTEN));
		alleSpielplatten.add(4, new Kreuzung(Ausrichtung.KREUZUNGUNTEN));
		alleSpielplatten.add(6, new Kurve(Ausrichtung.KURVEUNTENLINKS));
		
		//Reihe 3
		alleSpielplatten.add(14, new Kreuzung(Ausrichtung.KREUZUNGRECHTS));
		alleSpielplatten.add(16, new Kreuzung(Ausrichtung.KREUZUNGRECHTS));
		alleSpielplatten.add(18, new Kreuzung(Ausrichtung.KREUZUNGUNTEN));
		alleSpielplatten.add(20, new Kreuzung(Ausrichtung.KREUZUNGLINKS));
		
		//Reihe 5
		alleSpielplatten.add(28, new Kreuzung(Ausrichtung.KREUZUNGRECHTS));
		alleSpielplatten.add(30, new Kreuzung(Ausrichtung.KREUZUNGOBEN));
		alleSpielplatten.add(32, new Kreuzung(Ausrichtung.KREUZUNGLINKS));
		alleSpielplatten.add(34, new Kreuzung(Ausrichtung.KREUZUNGLINKS));
		
		//Reihe 7
		alleSpielplatten.add(42, new Kurve(Ausrichtung.KURVEOBENRECHTS));
		alleSpielplatten.add(44, new Kreuzung(Ausrichtung.KREUZUNGOBEN));
		alleSpielplatten.add(46, new Kreuzung(Ausrichtung.KREUZUNGOBEN));
		alleSpielplatten.add(48, new Kurve(Ausrichtung.KURVEOBENLINKS));
	}
}
