package com.dhbw.dvst.activities;

import android.app.Activity;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.utilities.SpinnerBuilder;

public abstract class SpielerActivity extends Activity {
	protected Spiel spiel = Spiel.getInstance();
	protected EditText et_name;
	protected Spinner spin_farbe;
	protected Spinner spin_form;
	protected ActivityInteraction kommunikation = new ActivityInteraction();

	protected void makeSpinners() {
		SpinnerBuilder spinbuilder = new SpinnerBuilder();
		this.spin_farbe = spinbuilder.initFarbspinner(this);
		this.spin_form = spinbuilder.initFormspinner(this);
	}
	
	protected abstract void checkInputAndSave();

	protected void checkInput(Object selectedFarbe, Object selectedForm) {
		for (Spielfigur figur : spiel.getAlleSpielfiguren()) {            			
			if(figur.getFarbe().compare(selectedFarbe.toString()) &
					figur.getForm().compare(selectedForm.toString())){
				if(figur.isVergeben()){
					new Fehlermeldung(SpielerActivity.this, getString(R.string.err_vergeben));
				}
				else{
					savePlayerSettings(figur);
				}
			}
		}
	}

	protected abstract void savePlayerSettings(Spielfigur figur);
}
