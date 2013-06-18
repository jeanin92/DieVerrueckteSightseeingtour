package com.dhbw.dvst.utilities;

import java.util.ArrayList;

import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spielplatte;

public class SpielplattenEinschieber {

	private ArrayList<Spielplatte> alleSpielplatten;
	private Spielbrett spielbrett;
	
	public SpielplattenEinschieber() {
	}

	public void initSpielplattenEinschieber(Spielbrett spielbrett) {
		this.spielbrett = spielbrett;
		alleSpielplatten = spielbrett.getAlleSpielplatten();
	}
	
	public void spielplatteEinschieben(Spielplatte platte) {
		int indexGeklicktePlatte = alleSpielplatten.indexOf(platte);
		
		if(indexGeklicktePlatte == 7 || indexGeklicktePlatte == 21 || indexGeklicktePlatte == 35) {
			spielplatteLinksEinschieben(indexGeklicktePlatte);
			figurUmsetzen(indexGeklicktePlatte);
			
		} else if (indexGeklicktePlatte == 13 || indexGeklicktePlatte == 27 || indexGeklicktePlatte == 41) {
			spielplatteRechtsEinschieben(indexGeklicktePlatte);
			figurUmsetzen(indexGeklicktePlatte);
			
		} else if (indexGeklicktePlatte == 1 || indexGeklicktePlatte == 3 || indexGeklicktePlatte == 5) {
			spielplatteObenEinschieben(indexGeklicktePlatte);
			figurUmsetzen(indexGeklicktePlatte);
		
		} else if (indexGeklicktePlatte == 43 || indexGeklicktePlatte == 45 || indexGeklicktePlatte == 47) {
			spielplatteUntenEinschieben(indexGeklicktePlatte);
			figurUmsetzen(indexGeklicktePlatte);
		}
	}
	
	public void spielplatteLinksEinschieben(int indexGeklicktePlatte) {
		int indexPlatteRaus = indexGeklicktePlatte+6;
		int neuerIndexGeklicktePlatte = indexGeklicktePlatte+1;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		alleSpielplatten.remove(indexPlatteRaus);

		aktualisiereAktivePlatte(indexGeklicktePlatte, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteRechtsEinschieben(int indexGeklicktePlatte) {
		int indexPlatteRaus = indexGeklicktePlatte-6;
		int neuerIndexGeklicktePlatte = indexGeklicktePlatte-1;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		alleSpielplatten.remove(indexPlatteRaus);
		
		aktualisiereAktivePlatte(indexGeklicktePlatte, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteObenEinschieben(int indexGeklicktePlatte) {
		int indexPlatteRaus = indexGeklicktePlatte+42;
		int neuerIndexGeklicktePlatte = indexGeklicktePlatte+7;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		
		
		for(int i = indexPlatteRaus; i > indexGeklicktePlatte; i=i-7) {
			alleSpielplatten.remove(i);
			alleSpielplatten.add(i, alleSpielplatten.get(i-7));
		}
		alleSpielplatten.remove(indexGeklicktePlatte);
		
		aktualisiereAktivePlatte(indexGeklicktePlatte, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void spielplatteUntenEinschieben(int indexGeklicktePlatte) {
		int indexPlatteRaus = indexGeklicktePlatte-42;
		int neuerIndexGeklicktePlatte = indexGeklicktePlatte-7;
		Spielplatte neueAktivePlatte = alleSpielplatten.get(indexPlatteRaus);
		for(int i = indexPlatteRaus; i < indexGeklicktePlatte; i=i+7) {
			alleSpielplatten.remove(i);
			alleSpielplatten.add(i, alleSpielplatten.get(i+6));
		}
		alleSpielplatten.remove(indexGeklicktePlatte);
		
		aktualisiereAktivePlatte(indexGeklicktePlatte, neueAktivePlatte);
		aktualisiereSchiebbarePlatten(indexPlatteRaus, neuerIndexGeklicktePlatte);
	}
	
	public void aktualisiereAktivePlatte(int indexGeklicktePlatte,
			Spielplatte neueAktivePlatte) {
		alleSpielplatten.add(indexGeklicktePlatte, spielbrett.getAktivePlatte());
		spielbrett.setAktivePlatte(neueAktivePlatte);
	}

	public void aktualisiereSchiebbarePlatten(int indexPlatteRaus,
			int neuerIndexGeklicktePlatte) {
		for (Spielplatte platte : alleSpielplatten) {
			platte.setSchiebbar(false);
		}
		spielbrett.setSchiebbarePlatten();
//		alleSpielplatten.get(neuerIndexGeklicktePlatte).setSchiebbar(false);
//		alleSpielplatten.get(indexPlatteRaus).setSchiebbar(true);
	}
	
	public void figurUmsetzen(int index) {
		if(spielbrett.getAktivePlatte().getFigur() != null) {
//			Figur von der aktiven Platte holen und auf die eingeschobene Platte setzen
			alleSpielplatten.get(index).setFigur(spielbrett.getAktivePlatte().getFigur());
//			der Figur den neuen Platz mitteilen
			spielbrett.getAktivePlatte().getFigur().setSpielplatte(alleSpielplatten.get(index));
//			Figur von der aktiven Platte entfernen
			spielbrett.getAktivePlatte().setFigur(null);
			
		}
	}
}
