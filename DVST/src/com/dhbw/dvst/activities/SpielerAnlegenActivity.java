package com.dhbw.dvst.activities;

import android.os.Bundle;
import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spielfigur;

public class SpielerAnlegenActivity extends SpielerActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setSpielerView();
		view.getTextviewById(R.id.hd_spieler).setText(R.string.spieler_erstellen);
		makeSpinners();
	}	

	protected void checkInputAndSave() {
		checkInput(this.selectedFarbe, this.selectedForm);
	}
	
	@Override
	protected void savePlayerSettings(Spielfigur figur) {
		this.spiel.spielerHinzufuegen(this.et_name.getText().toString().trim(), figur);
		this.kommunikation.navigieren(SpielerAnlegenActivity.this, SpielerUebersichtActivity.class);
	}
}
