package com.dhbw.dvst.models;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Stack;

public class Spielbrett {
	
	public static final Integer kurve = 0;
	public static final Integer gerade = 1;
	public static final Integer kreuzung = 2;
	
	private ArrayList<Spielplatte> alleSpielplatten = new ArrayList<Spielplatte>();
	private Random plattenRandomizer = new Random();

	public Spielbrett() {
	}

	public void fuelleLosesSpielplattenArray() {
		for(int ku = 0; ku < 15; ku++) {
			alleSpielplatten.add(new Kurve());
		}
			
		for(int ge = 0; ge < 13; ge++) {
			alleSpielplatten.add(new Gerade());
			}
		
		for(int kr = 0; kr < 6; kr++) {
				alleSpielplatten.add(new Kreuzung());
		}
		Collections.shuffle(alleSpielplatten);	
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
	
	public void verteileSpielfiguren(ArrayList<Spieler> alleSpieler){
		int i = 0;
		int randomElementIndex;
		while (i < alleSpieler.size()) {
			randomElementIndex = plattenRandomizer.nextInt(alleSpielplatten.size()-1);
			Spielplatte platte = alleSpielplatten.get(randomElementIndex);
			Spielfigur figur = alleSpieler.get(i).getSpielfigur();
			if(platte.getFigur()==null){
				platte.setFigur(figur);
				figur.setSpielplatte(platte);
				i++;
			}
		}
	}
	
	public void verteileSehenswuerdigkeiten(Stack<Sehenswuerdigkeit> stapel){
		int i = 0;
		int randomElementIndex;
		while (i < stapel.size()) {
			randomElementIndex = plattenRandomizer.nextInt(alleSpielplatten.size()-1);
			Spielplatte platte = alleSpielplatten.get(randomElementIndex);
			if(platte.getFigur()==null && platte.getZiel()==null){
				platte.ziel = stapel.get(i);
				i++;
			}
		}
	}
	
	public void mischeKartenstapel(Stack<Sehenswuerdigkeit> kartenstapel){
		kartenstapel.addAll(Arrays.asList(Sehenswuerdigkeit.values()));
		Collections.shuffle(kartenstapel);
	}
	
	public void setSchiebbarePlatten(){
		//TODO: Spielinitialisierung: alle schiebbaren Platten am Rand setzen
	}
	
	public void aktualisiereSchiebbarePlatten(){
		//TODO: beim Einschieben: 
		// aktive Platte bleibt schiebbar
		// zwei müssen geändert werden
		// während des Spielzugs
	}
}
