package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnKeyListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Control;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.utilities.SpinnerBuilder;

public abstract class SpielerActivity extends Activity {
	protected Spiel spiel = Control.getInstance();
	protected EditText et_name;
	protected Spinner spin_farbe;
	protected Spinner spin_form;
	protected ActivityInteraction kommunikation = new ActivityInteraction();

	
	protected void buildPlayerSettingsDialogue() {
		this.et_name = (EditText) findViewById(R.id.et_name);
		et_name.setOnKeyListener(new OnKeyListener() {
		    public boolean onKey(View v, int keyCode, KeyEvent event) {
		        if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
		            (keyCode == KeyEvent.KEYCODE_ENTER)) {
		    	  InputMethodManager inputmethod = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		          inputmethod.hideSoftInputFromWindow(et_name.getWindowToken(), 0);
		          return true;
		        }
		        return false;
		    }
		});

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
