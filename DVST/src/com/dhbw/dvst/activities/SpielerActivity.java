package com.dhbw.dvst.activities;

import com.dhbw.dvst.R;
import com.dhbw.dvst.helper.Fehlermeldung;
import com.dhbw.dvst.helper.KommunikationActivities;
import com.dhbw.dvst.helper.SpinnerBuilder;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;
import com.dhbw.dvst.model.Spieler;
import com.dhbw.dvst.model.Spielfigur;

import android.app.Activity;
import android.content.res.Configuration;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public abstract class SpielerActivity extends Activity {
	protected Spiel spiel = Control.getInstance();
	protected EditText et_name;
	protected Spinner spin_farbe;
	protected Spinner spin_form;
	protected KommunikationActivities kommunikation = new KommunikationActivities();

	
	protected void buildPlayerSettingsDialogue() {
		this.et_name = (EditText) findViewById(R.id.et_name);
		SpinnerBuilder spinbuilder = new SpinnerBuilder();
		this.spin_farbe = spinbuilder.initFarbspinner(this);
		this.spin_form = spinbuilder.initFormspinner(this);
	}

	protected void setSaveButton() {
		final Button btn_speichern = (Button) findViewById(R.id.btn_erstellen);
		btn_speichern.setOnClickListener(new View.OnClickListener() {
	        public void onClick(View v) {
	        	if(SpielerActivity.this.et_name.getText().toString().trim().length() == 0){
	        		SpielerActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
	        	}
	        	else if(SpielerActivity.this.spin_farbe.getSelectedItem()==null ||
	        			SpielerActivity.this.spin_form.getSelectedItem()==null){
	        		new Fehlermeldung(SpielerActivity.this, getString(R.string.err_nichts_selektiert));
	        	}
	        	else{
	        		checkInputAndSave();            		
	        	}           	
	        }
	    });
	}

	protected abstract void checkInputAndSave();

	protected void checkInput() {
		for (Spielfigur figur : spiel.getAlleSpielfiguren()) {            			
			if(figur.getFarbe().compare(this.spin_farbe.getSelectedItem().toString()) &
					figur.getForm().compare(this.spin_form.getSelectedItem().toString())){
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
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  super.onConfigurationChanged(newConfig);
	}

}
