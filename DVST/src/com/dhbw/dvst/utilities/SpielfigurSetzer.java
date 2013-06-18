package com.dhbw.dvst.utilities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielplatte;

public class SpielfigurSetzer {

	private ArrayList<Spielplatte> alleSpielplatten;
	private Spiel spiel;

	public SpielfigurSetzer() {
	}

	public void initSpielfigurSetzer() {
		spiel = Spiel.getInstance();
		alleSpielplatten = spiel.getSpielbrett().getAlleSpielplatten();
	}
	
	public boolean figurKannGesetztWerden(Spielplatte zielPlatte, Spieler spieler) {
		HashSet<Spielplatte> erreichbarePlatten = new HashSet<Spielplatte>();
		Spielplatte startPlatte = spieler.getSpielfigur().getSpielplatte();
		erreichbarePlatten.add(startPlatte);
		
		Iterator<Spielplatte> iterator = erreichbarePlatten.iterator();
		Spielplatte next;
		
		while(iterator.hasNext()) {
			next = iterator.next();
			
			holeNachbarPlatten(erreichbarePlatten, next);
			
			if(erreichbarePlatten.contains(zielPlatte)) {
				return true;
			}
		}
		return false;
	}
	
	protected void holeNachbarPlatten(HashSet<Spielplatte> erreichbarePlatten, Spielplatte next) {
		if(next.isLinksOffen()) {
			if(getPlatteLinks(next) != null) {
				erreichbarePlatten.add(getPlatteLinks(next));
			}
		}
		if (next.isObenOffen()) {
			if(getPlatteOben(next) != null) {
				erreichbarePlatten.add(getPlatteOben(next));
			}
		}
		if (next.isUntenOffen()) {
			if(getPlatteUnten(next) != null) {
				erreichbarePlatten.add(getPlatteUnten(next));
			}
		}
		if (next.isRechtsOffen()) {
			if(getPlatteRechts(next) != null) {
				erreichbarePlatten.add(getPlatteRechts(next));
			}
		}
	}
	
	private Spielplatte getPlatteOben(Spielplatte next) {
		int indexOfNext = alleSpielplatten.indexOf(next);
		Spielplatte platteOben = alleSpielplatten.get(indexOfNext-7);
		if(platteOben.isUntenOffen()) {
			return platteOben;
		}
		return null;
	}
	
	private Spielplatte getPlatteUnten(Spielplatte next) {
		int indexOfNext = alleSpielplatten.indexOf(next);
		Spielplatte platteUnten = alleSpielplatten.get(indexOfNext+7);
		if(platteUnten.isObenOffen()) {
			return platteUnten;
		}
		return null;
	}
	
	private Spielplatte getPlatteRechts(Spielplatte next) {
		int indexOfNext = alleSpielplatten.indexOf(next);
		Spielplatte platteRechts = alleSpielplatten.get(indexOfNext+1);
		if(platteRechts.isLinksOffen()) {
			return platteRechts;
		}
		return null;
	}
	
	private Spielplatte getPlatteLinks(Spielplatte next) {
		int indexOfNext = alleSpielplatten.indexOf(next);
		Spielplatte platteLinks =  alleSpielplatten.get(indexOfNext-1);
		if(platteLinks.isRechtsOffen()) {
			return platteLinks;
		}
		return null;
	}
	
	public void figurSetzen(Spielplatte zielPlatte, Spieler spieler,
			Spielplatte startPlatte) {
		spieler.getSpielfigur().setSpielplatte(zielPlatte);
		zielPlatte.setFigur(spieler.getSpielfigur());
		startPlatte.setFigur(null);
	}
}
