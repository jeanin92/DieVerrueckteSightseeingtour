package com.dhbw.dvst.activities;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Control;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.views.GeraeteView;

public class GeraeteActivity extends Activity {
	private Spiel spiel = Control.getInstance();
	private ActivityInteraction kommunikation = new ActivityInteraction();
	private GeraeteView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		view = (GeraeteView)View.inflate(this, R.layout.geraete, null);
		view.setViewListener(viewListener);
		setContentView(view);
	}
	
	private GeraeteView.ViewListener viewListener = new GeraeteView.ViewListener() {

		private int radioButton;

		@Override
		public void onGeraetezahlBestaetigen() {
			if (this.radioButton == R.id.rb_eins) {
				spiel.setSpielmodus(Spiel.modus_mehrspieler_client);
			}
			else if(this.radioButton == R.id.rb_mehrere) {
				spiel.setSpielmodus(Spiel.modus_mehrspieler_server);
			}
			kommunikation.navigieren(GeraeteActivity.this, SpielerUebersichtActivity.class);
		}

		@Override
		public void onGeraeteZahlAuswaehlen(int radioButton) {
			this.radioButton = radioButton;
		}
	};
}
