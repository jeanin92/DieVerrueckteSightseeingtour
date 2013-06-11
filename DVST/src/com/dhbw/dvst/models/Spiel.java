package com.dhbw.dvst.models;

import java.util.ArrayList;
import java.util.Stack;

public class Spiel{
	/**
	 * Spielmodi
	 */
	public static final int modus_einspieler = 0;
	public static final int modus_mehrspieler_server = 1;
	public static final int modus_mehrspieler_client = 2;
	
	
	private ArrayList<Spielfigur> alleSpielfiguren;
	private ArrayList<Spieler> alleSpieler;
	private int spielmodus;
	private Spielbrett spielbrett;
	private Stack<Sehenswuerdigkeit> kartenstapel;
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
		kartenstapel = new Stack<Sehenswuerdigkeit>();
	}

	public void initialisiereSpielbrett() {
		spielbrett = new Spielbrett();
		spielbrett.fuelleLosesSpielplattenArray();
		spielbrett.fuegeStatischePlattenEin();
		spielbrett.setSchiebbarePlatten();
		spielbrett.verteileSpielfiguren(alleSpieler);
		spielbrett.mischeKartenstapel(kartenstapel);
		spielbrett.verteileSehenswuerdigkeiten(kartenstapel);
	}
	
	/**
	 * Spielfiguren initialisieren
	 */
	public void initialisiereSpielfiguren() {
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("rot", "red"), "motorbike_red"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("rot", "red"), "car_red"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("rot", "red"), "bus_red"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("gelb", "yellow"), "motorbike_yellow"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("gelb", "yellow"), "car_yellow"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("gelb", "yellow"), "bus_yellow"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("gr�n", "green"), "motorbike_green"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("gr�n", "green"), "car_green"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("gr�n", "green"), "bus_green"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("motorrad", "motorbike"), new Farbe("blau", "blue"), "mototrbike_blue"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("auto", "car"), new Farbe("blau", "blue"), "car_blue"));
		this.alleSpielfiguren.add(new Spielfigur(new Form("bus", "bus"), new Farbe("blau", "blue"), "bus_blue"));
	}
	
	public void spielerHinzufuegen(Spieler spieler) {
			this.alleSpieler.add(spieler);
			spieler.getSpielfigur().setVergeben(true);
	}
	
	public void spielerLoeschen(Spieler spieler) {
		spieler.getSpielfigur().setVergeben(false);
		this.alleSpieler.remove(spieler);
	}

	public ArrayList<Spielfigur> getAlleSpielfiguren() {
		return alleSpielfiguren;
	}

	public ArrayList<Spieler> getAlleSpieler() {
		return alleSpieler;
	}

	public Spielbrett getSpielbrett() {
		return spielbrett;
	}

	public void setSpielmodus(int spielmodus) {
		this.spielmodus = spielmodus;
	}

}
