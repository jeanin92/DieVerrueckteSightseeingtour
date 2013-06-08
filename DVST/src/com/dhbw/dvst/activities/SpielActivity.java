package com.dhbw.dvst.activities;

import java.util.ArrayList;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.adapters.SpielbrettAdapter;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielplatte;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.BeendenDialog;
import com.dhbw.dvst.views.SpielView;

public class SpielActivity extends Activity{
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private SpielView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		view = (SpielView)View.inflate(this, R.layout.spielbildschirm, null);
		view.setViewListener(viewListener);
		setContentView(view);
		final GridView grid_spielbrett = (GridView)findViewById(R.id.grid_spielbrett);
		ArrayList<Spielplatte> spielfeldArray = Spiel.getInstance().getSpielbrett().getAlleSpielplatten();
		spielfeldArray.remove(49);
		final SpielbrettAdapter adapter = new SpielbrettAdapter(this, 
        		R.layout.zeilenansicht, R.id.tv_gewaehlter_name, spielfeldArray);
        grid_spielbrett.setAdapter(adapter);
	}
	
	/**
	 * This is how we receive events from the view.(Funktionen, die im View im Template aufgerufen werden)
	 * The view takes user actions
	 * The controller/activity responds to user actions
	 */
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
			new BeendenDialog(SpielActivity.this, getString(R.string.err_beenden), positiv_listener);			
		}

		@Override
		public void onReadManual() {
			kommunikation.navigieren(SpielActivity.this, AnleitungActivity.class, true);
		}
	};
}
