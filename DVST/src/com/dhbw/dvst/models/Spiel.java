package com.dhbw.dvst.models;

import java.util.ArrayList;

public class Spiel{
	/**
	 * Spielmodi
	 */
	public static final int modus_einspieler = 0;
	public static final int modus_mehrspieler_server = 1;
	public static final int modus_mehrspieler_client = 2;
	

	
	private ArrayList<Spielfigur> alleSpielfiguren;
	private ArrayList<Spieler> alleSpieler;
	private ArrayList<Spielplatte> alleSpielplatten;
	private int spielmodus;
	private Spielbrett spielbrett;
	private Spielplatte platte_aktiv;
	private ArrayList<Spielkarte> kartenstapel;
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
	
	/**
	 * Konstruktor
	 */
	public Spiel() {
//		language = Locale.getDefault().getLanguage();
		alleSpielfiguren = new ArrayList<Spielfigur>();
		initialisiereSpielfiguren();
		alleSpieler = new ArrayList<Spieler>(6);
		alleSpielplatten = new ArrayList<Spielplatte>();
		spielbrett = new Spielbrett(alleSpielplatten);
	}
	
	/**
	 * Spielfiguren initialisieren
	 */
	public void initialisiereSpielfiguren() {
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("rot", "red"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("rot", "red"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("rot", "red"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("gelb", "yellow"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("gelb", "yellow"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("gelb", "yellow"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("grün", "green"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("grün", "green"), ""));			this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("grün", "green"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("blau", "blue"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("blau", "blue"), ""));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("blau", "blue"), ""));
	}
	
	public void spielerHinzufuegen(String name, Spielfigur spielfigur) {
			Spieler neuerSpieler = new Spieler(name, spielfigur);
			this.alleSpieler.add(neuerSpieler);
			spielfigur.setVergeben(true);
	}
	
	public void spielerLoeschen(Spieler spieler) {
		spieler.getSpielfigur().setVergeben(false);
		this.alleSpieler.remove(spieler);
	}
	
	public int getSpielmodus() {
		return spielmodus;
	}

	public void setSpielmodus(int spielmodus) {
		this.spielmodus = spielmodus;
	}

	public ArrayList<Spielfigur> getAlleSpielfiguren() {
		return alleSpielfiguren;
	}

	public void setAlleSpielfiguren(ArrayList<Spielfigur> alleSpielfiguren) {
		this.alleSpielfiguren = alleSpielfiguren;
	}

	public ArrayList<Spieler> getAlleSpieler() {
		return alleSpieler;
	}

	public void setAlleSpieler(ArrayList<Spieler> alleSpieler) {
		this.alleSpieler = alleSpieler;
	}

	public Spielbrett getSpielbrett() {
		return spielbrett;
	}

	public void setSpielbrett(Spielbrett spielbrett) {
		this.spielbrett = spielbrett;
	}

	public Spielplatte getPlatte_aktiv() {
		return platte_aktiv;
	}

	public void setPlatte_aktiv(Spielplatte platte_aktiv) {
		this.platte_aktiv = platte_aktiv;
	}

	public ArrayList<Spielkarte> getKartenstapel() {
		return kartenstapel;
	}

	public void setKartenstapel(ArrayList<Spielkarte> kartenstapel) {
		this.kartenstapel = kartenstapel;
	}

}
