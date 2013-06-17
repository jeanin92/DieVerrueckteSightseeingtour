package com.dhbw.dvst.utilities;

import java.util.ArrayList;

import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spielplatte;

public class SpielplattenEinschieber {

	private ArrayList<Spielplatte> alleSpielplatten;
	private Spiel spiel;
	private Spielbrett spielbrett;
	
	public SpielplattenEinschieber() {
		spiel = Spiel.getInstance();
		spielbrett = spiel.getSpielbrett();
		alleSpielplatten = spielbrett.getAlleSpielplatten();
	}
	
	public void spielplatteEinschieben(Spielplatte platte) {
		int index = alleSpielplatten.indexOf(platte);
		
		if(index == 7 || index == 21 || index == 35) {
			spielplatteLinksEinschieben(index);
			figurUmsetzen(index);
			
		} else if (index == 13 || index == 27 || index == 41) {
			spielplatteRechtsEinschieben(index);
			figurUmsetzen(index);
			
		} else if (index == 1 || index == 3 || index == 5) {
			spielplatteObenEinschieben(index);
			figurUmsetzen(index);
		
		} else if (index == 43 || index == 45 || index == 47) {
			spielplatteUntenEinschieben(index);
			figurUmsetzen(index);
		}
	}
	
	public void spielplatteLinksEinschieben(int index) {
		int indexPlatteRaus = index+6;
		int neuerIndexGeklicktePlatte = index+1;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		alleSpielplatten.remove(indexPlatteRaus);
		
		aktualisiereAktivePlatte(index, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteRechtsEinschieben(int index) {
		int indexPlatteRaus = index-6;
		int neuerIndexGeklicktePlatte = index-1;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		alleSpielplatten.remove(indexPlatteRaus);
		
		aktualisiereAktivePlatte(index, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteObenEinschieben(int index) {
		int indexPlatteRaus = index+42;
		int neuerIndexGeklicktePlatte = index+7;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		for(int i = indexPlatteRaus; i > index; i=i-7) {
			alleSpielplatten.remove(i);
			alleSpielplatten.add(i, alleSpielplatten.get(i-7));
		}
		alleSpielplatten.remove(index);
		
		aktualisiereAktivePlatte(index, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteUntenEinschieben(int index) {
		int indexPlatteRaus = index-42;
		int neuerIndexGeklicktePlatte = index-7;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		for(int i = indexPlatteRaus; i < index; i=i+7) {
			alleSpielplatten.remove(i);
			alleSpielplatten.add(i, alleSpielplatten.get(i+6));
		}
		alleSpielplatten.remove(index);
		
		aktualisiereAktivePlatte(index, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void aktualisiereAktivePlatte(int index,
			Spielplatte neueAktivePlatte) {
		alleSpielplatten.add(index, spielbrett.getAktivePlatte());
		spielbrett.setAktivePlatte(neueAktivePlatte);
	}

	public void aktualisiereSchiebbarePlatten(int indexPlatteRaus,
			int neuerIndexGeklicktePlatte) {
		alleSpielplatten.get(neuerIndexGeklicktePlatte).setSchiebbar(false);
		alleSpielplatten.get(indexPlatteRaus).setSchiebbar(true);
	}
	
	public void figurUmsetzen(int index) {
		if(spielbrett.getAktivePlatte().getFigur() != null) {
			alleSpielplatten.get(index).setFigur(spielbrett.getAktivePlatte().getFigur());
			spielbrett.getAktivePlatte().setFigur(null);
		}
	}
}
