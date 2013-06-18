package com.dhbw.dvst.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.adapters.FortschrittArrayAdapter;
import com.dhbw.dvst.adapters.SpielbrettAdapter;
import com.dhbw.dvst.models.Sehenswuerdigkeit;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielbrett;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielplatte;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.KarteZiehenDialog;
import com.dhbw.dvst.utilities.Meldung;
import com.dhbw.dvst.utilities.SpielDialog;
import com.dhbw.dvst.utilities.SpielfigurSetzer;
import com.dhbw.dvst.utilities.SpielplattenEinschieber;
import com.dhbw.dvst.views.SpielView;

public class SpielActivity extends Activity{
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private SpielView view;
	private SpielbrettAdapter brettAdapter;
	private Spiel spiel = Spiel.getInstance();
	private Spielplatte angeklicktePlatte;
	private Spieler aktiverSpieler;
	private GridView grid_spielbrett;
	private ListView lv_fortschritt;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		view = (SpielView)View.inflate(this, R.layout.spielbildschirm, null);
		view.setViewListener(viewListener);
		setContentView(view);
		setSpielbrettAdapter();
		setBildAktivePlatte();
		setFortschrittsAnzeigeAdapter();
		
		openKartenAnkuendigung();
	}

	protected void setSpielbrettAdapter() {
		grid_spielbrett = (GridView)findViewById(R.id.grid_spielbrett);
		brettAdapter = new SpielbrettAdapter(this, R.layout.zeilenansicht ,R.id.tv_gewaehlter_name, 
				spiel.getSpielbrett().getAlleSpielplatten());
        grid_spielbrett.setAdapter(brettAdapter);
	}
	
	protected void setBildAktivePlatte(){
		final ImageView platte = (ImageView)findViewById(R.id.img_aktive_platte);		
		int resID = getResources().getIdentifier(spiel.getSpielbrett().getAktivePlatte().getMotivURL(), "drawable", "com.dhbw.dvst");
		platte.setImageResource(resID);
		platte.setRotation(spiel.getSpielbrett().getAktivePlatte().getAusrichtung().getRotation());
		
		Sehenswuerdigkeit ziel = spiel.getSpielbrett().getAktivePlatte().getZiel();
		final ImageView sehenswuerdigkeit = (ImageView)findViewById(R.id.img_sehenswuerdigkeit);
		if(ziel != null){			
			resID = getResources().getIdentifier(ziel.getMotivURL(), "drawable", "com.dhbw.dvst");
			sehenswuerdigkeit.setImageResource(resID);
		}
		else{
			sehenswuerdigkeit.setImageResource(android.R.color.transparent);
		}	
	}
	
	protected void setFortschrittsAnzeigeAdapter(){
		lv_fortschritt = (ListView)findViewById(R.id.lv_fortschritt);
		FortschrittArrayAdapter fortschrittAdapter = new FortschrittArrayAdapter(this, R.id.tv_gewaehlter_name, 
				spiel.getAlleSpieler());
        lv_fortschritt.setAdapter(fortschrittAdapter);
	}
	
	private void openKartenAnkuendigung(){
		AlertDialog.Builder dialog = new AlertDialog.Builder(this);
		dialog.setMessage(getString(R.string.anderReihe)+" "+spiel.getSpielerAnDerReihe()+"!");
		dialog.setNeutralButton(R.string.karteZiehen, new OnClickListener() {
			
			@Override
			public void onClick(DialogInterface dialog, int which) {
				spiel.karteZuweisen();
				lv_fortschritt.invalidateViews();
				dialog.cancel();
				new KarteZiehenDialog(SpielActivity.this, new OnClickListener() {					
					@Override
					public void onClick(DialogInterface dialog, int which) {
						spiel.getAblauf().karteGezogen();
					}
				});
			}
		});
		dialog.show();
	}
	
	private SpielView.ViewListener viewListener = new SpielView.ViewListener() {
		
		@Override
		public void onBeenden() {
			OnClickListener positiv_listener = new OnClickListener() {				
				@Override
				public void onClick(DialogInterface dialog, int which) {
					Spiel.resetInstance();
					kommunikation.navigieren(SpielActivity.this, ModusActivity.class);					
				}
			};
			new SpielDialog(SpielActivity.this, getString(R.string.err_beenden), positiv_listener);			
		}

		@Override
		public void onReadManual() {
			kommunikation.navigieren(SpielActivity.this, AnleitungActivity.class, true);
		}

		@Override
		public void onNachLinksDrehen(ImageView img_aktive_platte) {
			Spielplatte aktiv = spiel.getSpielbrett().getAktivePlatte();
			aktiv.dreheSpielplatteNachLinks();
			img_aktive_platte.setRotation(aktiv.getAusrichtung().getRotation());
		}

		@Override
		public void onNachRechtsDrehen(ImageView img_aktive_platte) {
			Spielplatte aktiv = spiel.getSpielbrett().getAktivePlatte();
			aktiv.dreheSpielplatteNachRechts();
			img_aktive_platte.setRotation(aktiv.getAusrichtung().getRotation());
		}

		@Override
		public void onSpielplatteAnklicken(int position) {
			angeklicktePlatte = (Spielplatte) grid_spielbrett.getItemAtPosition(position);
			//angeklicktePlatte = spiel.getSpielbrett().getAlleSpielplatten().get(position);

			aktiverSpieler = spiel.getSpielerAnDerReihe();
			
			if(spiel.getAblauf().isFigurZiehen()){
				
				//Figur setzen
				OnClickListener positiv_listener = new OnClickListener() {				
					@Override
					public void onClick(DialogInterface dialog, int which) {
						SpielfigurSetzer setzer = new SpielfigurSetzer();
						setzer.initSpielfigurSetzer();
						if(setzer.figurKannGesetztWerden(angeklicktePlatte, aktiverSpieler) == false) {
							new Meldung(SpielActivity.this, getString(R.string.err_kein_gueltiger_weg));
						} 
						else {
							setzer.figurSetzen(angeklicktePlatte, aktiverSpieler);
							spiel.getAblauf().spielzugFertig();							
							grid_spielbrett.invalidateViews();
							if(spiel.pruefenObSehenwuerdigkeitErreicht(angeklicktePlatte)){
								angeklicktePlatte.setZiel(null);
								aktiverSpieler.setZiel(null);
								aktiverSpieler.inkrementFortschritt();
								new Meldung(SpielActivity.this, getString(R.string.ziel_erreicht), new OnClickListener() {
									
									@Override
									public void onClick(DialogInterface dialog, int which) {
										dialog.cancel();
										spiel.spielerWechseln();
										openKartenAnkuendigung();																				
									}
								});
							}
							else{
								spiel.spielerWechseln();
								openKartenAnkuendigung();
							}
						}
					}
				};
				new SpielDialog(SpielActivity.this, "Willst du wirklich hierhin?", positiv_listener);
			}
			else if(spiel.getAblauf().isPlatteEinschieben()){
				//Platte einschieben
				if(angeklicktePlatte.isSchiebbar()) {
					SpielplattenEinschieber schieber = new SpielplattenEinschieber();
					schieber.initSpielplattenEinschieber(Spiel.getInstance().getSpielbrett());
					schieber.spielplatteEinschieben(angeklicktePlatte);
					
					brettAdapter.notifyDataSetChanged();
					grid_spielbrett.invalidateViews();
					setBildAktivePlatte();
					
					spiel.getAblauf().platteEingeschoben();
				} else {
					new Meldung(SpielActivity.this, getString(R.string.err_platte_nicht_schiebbar));
				}
			}			
		}
	};
}
