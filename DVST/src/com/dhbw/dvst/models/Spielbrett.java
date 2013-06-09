package com.dhbw.dvst.models;

import java.util.ArrayList;
import java.util.Random;

public class Spielbrett {
	
	public static final Integer kurve = 0;
	public static final Integer gerade = 1;
	public static final Integer kreuzung = 2;
	
	private ArrayList<Spielplatte> alleSpielplatten = new ArrayList<Spielplatte>();
	private ArrayList<Integer> unsortiertesIntPlattenArray = new ArrayList<Integer>();
	private Random plattenRandomizer = new Random();

	public Spielbrett() {}

	public void fuelleLosesSpielplattenArray() {
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
	
	public void baueIntArrayMitAnzahlVerschiedenerPlatten() {
		for(int ku = 0; ku < 15; ku++) {
			this.unsortiertesIntPlattenArray.add(kurve);
		}
		for(int ge = 0; ge < 13; ge++) {
			this.unsortiertesIntPlattenArray.add(gerade);
		}
		for(int kr = 0; kr < 6; kr++) {
			this.unsortiertesIntPlattenArray.add(kreuzung);
		}
	}
	
	public void fuegeStatischePlattenEin() {
		
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
	
	public ArrayList<Spielplatte> getAlleSpielplatten() {
		return alleSpielplatten;
	}

	public ArrayList<Integer> getUnsortiertesIntPlattenArray() {
		return unsortiertesIntPlattenArray;
	}
}
