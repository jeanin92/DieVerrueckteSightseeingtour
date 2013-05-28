package com.dhbw.dvst.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.views.SpielerView;

public class SpielerAnlegenActivity extends SpielerActivity {
	private SpielerView view;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		view = (SpielerView)View.inflate(this, R.layout.spieler, null);
		view.setViewListener(viewListener);
		setContentView(view);
		
		makeSpinners();

		//TODO: here oder in View?
		TextView spielerSettingsHeading = (TextView) findViewById(R.id.hd_spieler);
		spielerSettingsHeading.setText(R.string.spieler_bearbeiten);
	}	

	protected void checkInputAndSave() {
		checkInput();
	}
	
	protected void savePlayerSettings(Spielfigur figur) {
		this.spiel.spielerHinzufuegen(this.et_name.getText().toString().trim(), figur);
		this.kommunikation.navigieren(SpielerAnlegenActivity.this, SpielerUebersichtActivity.class);
	}
}
