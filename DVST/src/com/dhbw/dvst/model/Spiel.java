package com.dhbw.dvst.model;

import java.util.ArrayList;

public class Spiel {
	
	private ArrayList<Spielfigur> alleSpielfiguren;
	private ArrayList<Spieler> alleSpieler;
	private String spielmodus;
	
	/**
	 * Konstruktor
	 */
	public Spiel(String spielmodus) {
		this.spielmodus = spielmodus;
		alleSpielfiguren = new ArrayList<Spielfigur>();
		initialisiereSpielfiguren();
		alleSpieler = new ArrayList<Spieler>();
	}
	
	/**
	 * Spielfiguren initialisieren
	 */
	public void initialisiereSpielfiguren() {
		this.alleSpielfiguren.add(new Spielfigur("motorrad", "rot", ""));
		this.alleSpielfiguren.add(new Spielfigur("auto", "rot", ""));
		this.alleSpielfiguren.add(new Spielfigur("bus", "rot", ""));
		this.alleSpielfiguren.add(new Spielfigur("motorrad", "gelb", ""));
		this.alleSpielfiguren.add(new Spielfigur("auto", "gelb", ""));
		this.alleSpielfiguren.add(new Spielfigur("bus", "gelb", ""));
		this.alleSpielfiguren.add(new Spielfigur("motorrad", "gruen", ""));
		this.alleSpielfiguren.add(new Spielfigur("auto", "gruen", ""));
		this.alleSpielfiguren.add(new Spielfigur("bus", "gruen", ""));
		this.alleSpielfiguren.add(new Spielfigur("motorrad", "blau", ""));
		this.alleSpielfiguren.add(new Spielfigur("auto", "blau", ""));
		this.alleSpielfiguren.add(new Spielfigur("bus", "blau", ""));
	}
	
	/**
	 * Spieler zum Spiel hinzufuegen
	 * @param name
	 * @param spielfigur
	 */
	public void spielerHinzufuegen(String name, Spielfigur spielfigur) {
		Spieler neuerSpieler = new Spieler(name, spielfigur);
		this.alleSpieler.add(neuerSpieler);
		setFigurVergeben(neuerSpieler);
	}

	/**
	 * Spielfigur als bereits an einen Spieler vergeben markieren
	 * @param neuerSpieler
	 */
	private void setFigurVergeben(Spieler neuerSpieler) {
		//foreach
		for (Spielfigur s : this.alleSpielfiguren) {
			if(s.getFarbe().equals(neuerSpieler.getSpielfigur().getFarbe())) {
				if(s.getForm().equals(neuerSpieler.getSpielfigur().getForm())) {
					s.setVergeben(true);
				}
			}
		}
	}
	
	/**
	 * Spieler loeschen und Spielfigur wieder freigeben
	 * @param spieler
	 */
	public void spielerLoeschen(Spieler spieler) {
		this.alleSpielfiguren.remove(spieler.getSpielfigur());
		this.alleSpieler.remove(spieler);
	}
}
