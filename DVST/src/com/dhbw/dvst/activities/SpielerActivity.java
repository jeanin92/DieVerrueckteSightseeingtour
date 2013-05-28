package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.utilities.SpinnerBuilder;
import com.dhbw.dvst.views.SpielerView;

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
	
	protected SpielerView.ViewListener viewListener = new SpielerView.ViewListener() {
		@Override
		public boolean onTastaturVerstecken(int keyCode, KeyEvent event) {
			if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
		            (keyCode == KeyEvent.KEYCODE_ENTER)) {
		    	  InputMethodManager inputmethod = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		          inputmethod.hideSoftInputFromWindow(et_name.getWindowToken(), 0);
		          return true;
		        }
			return false;
		}

		@Override
		public void onSpielerSpeichern() {
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
	};
	
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
}
