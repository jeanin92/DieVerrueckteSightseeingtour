package com.dhbw.dvst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ListView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.adapters.PlayerListArrayAdapter;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.views.SpielerUebersichtView;

public class SpielerUebersichtActivity extends Activity {
	private Spiel spiel = Spiel.getInstance();
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private SpielerUebersichtView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		view = (SpielerUebersichtView)View.inflate(this, R.layout.spieler_uebersicht, null);
		view.setViewListener(viewListener);
		setContentView(view);
		final ListView lv_spieler = (ListView)findViewById(R.id.lv_spieler);
		setSpielerliste(lv_spieler);
	}

	protected void setSpielerliste(final ListView listview) {
		final PlayerListArrayAdapter adapter = new PlayerListArrayAdapter(this, 
        		R.layout.zeilenansicht, R.id.tv_gewaehlter_name, spiel.getAlleSpieler());
        listview.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	/**
	 * This is how we receive events from the view.(Funktionen, die im View im Template aufgerufen werden)
	 * The view takes user actions
	 * The controller/activity responds to user actions
	 */
	private SpielerUebersichtView.ViewListener viewListener = new SpielerUebersichtView.ViewListener() {
		
		@Override
		public void onNeuerSpieler() {
			if(spiel.getAlleSpieler().size() == 6) {
        		new Fehlermeldung(SpielerUebersichtActivity.this, getString(R.string.err_max_spieleranzahl));
            	}
        	else {
        		kommunikation.navigieren(SpielerUebersichtActivity.this, SpielerAnlegenActivity.class);
        	}			
		}
		
		@Override
		public void onModusWechseln() {
			kommunikation.navigieren(SpielerUebersichtActivity.this, ModusActivity.class);
			
		}
		
		@Override
		public void onSpielStarten() {
			kommunikation.navigieren(SpielerUebersichtActivity.this, SpielActivity.class);
			
		}
	};
}


