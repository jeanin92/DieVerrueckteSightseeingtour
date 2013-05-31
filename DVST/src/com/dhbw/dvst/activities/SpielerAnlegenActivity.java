package com.dhbw.dvst.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.views.SpielerView;

public class SpielerAnlegenActivity extends SpielerActivity {
	private SpielerView view;
	private Object selectedFarbe;
	protected Object selectedForm;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		view = (SpielerView)View.inflate(this, R.layout.spieler, null);
		view.setViewListener(viewListener);
		setContentView(view);
		
		view.getTextviewById(R.id.hd_spieler).setText(R.string.spieler_erstellen);
		makeSpinners();
	}	
	
	protected SpielerView.ViewListener viewListener = new SpielerView.ViewListener() {
		@Override
		public boolean onTastaturVerstecken(int keyCode, KeyEvent event, EditText et_name) {
			if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
		            (keyCode == KeyEvent.KEYCODE_ENTER)) {
		    	  InputMethodManager inputmethod = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
		          inputmethod.hideSoftInputFromWindow(et_name.getWindowToken(), 0);
		          return true;
		        }
			return false;
		}

		@Override
		public void onSpielerSpeichern(EditText et_name, Object selectedFarbe,
				Object selectedForm) {
        	SpielerAnlegenActivity.this.et_name = et_name;
			SpielerAnlegenActivity.this.selectedFarbe = selectedFarbe;
			SpielerAnlegenActivity.this.selectedForm = selectedForm;
			if(et_name.getText().toString().trim().length() == 0){
				et_name.setError(getString(R.string.err_eingabe_leer));
        	}
        	else if(selectedFarbe == null || selectedForm == null){
        		new Fehlermeldung(SpielerAnlegenActivity.this, getString(R.string.err_nichts_selektiert));
        	}
        	else{
        		checkInputAndSave(); 
        	} 
		}
	};

	protected void checkInputAndSave() {
		checkInput(this.selectedFarbe, this.selectedForm);
	}
	
	@Override
	protected void savePlayerSettings(Spielfigur figur) {
		this.spiel.spielerHinzufuegen(this.et_name.getText().toString().trim(), figur);
		this.kommunikation.navigieren(SpielerAnlegenActivity.this, SpielerUebersichtActivity.class);
	}
}
