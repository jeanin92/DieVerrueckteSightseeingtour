package com.dhbw.dvst.activities;

import android.content.Context;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.utilities.Fehlermeldung;
import com.dhbw.dvst.views.SpielerView;

public class SpielerBearbeitenActivity extends SpielerActivity{
	private int spieler_index;
	private Spieler spieler;
	private SpielerView view;
	private Object selectedFarbe;
	private Object selectedForm;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		view = (SpielerView) View.inflate(this, R.layout.spieler, null);
		view.setViewListener(viewListener);
		setContentView(view);
		
		this.spieler_index = getIntent().getIntExtra("spieler_index", 0);
		this.spieler = spiel.getAlleSpieler().get(spieler_index);

		makeSpinners();

		view.getTextviewById(R.id.hd_spieler).setText(R.string.spieler_bearbeiten);
		view.getEt_name().setText(spieler.getName());
		setFarbspinner();
		setFormspinner();
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
			SpielerBearbeitenActivity.this.et_name = et_name;
			SpielerBearbeitenActivity.this.selectedFarbe = selectedFarbe;
			SpielerBearbeitenActivity.this.selectedForm = selectedForm;
			if(SpielerBearbeitenActivity.this.et_name.getText().toString().trim().length() == 0){
				SpielerBearbeitenActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
        	}
        	else if(SpielerBearbeitenActivity.this.spin_farbe.getSelectedItem()==null ||
        			SpielerBearbeitenActivity.this.spin_form.getSelectedItem()==null){
        		new Fehlermeldung(SpielerBearbeitenActivity.this, getString(R.string.err_nichts_selektiert));
        	}
        	else{
        		checkInputAndSave();            		
        	}   
		}
	};

	protected void setFormspinner() {
		String[] formen = getResources().getStringArray(R.array.figuren);
		this.spin_form.setSelection(getFormIndex(formen));
	}
	
	protected int getFormIndex(String[] formen) {
		for (int i = 0; i < formen.length; i++) {
			if(this.spieler.getSpielfigur().getForm().compare(formen[i])){
				return i;
			}
		}
		return -1;
	}
	
	protected void setFarbspinner() {
		String[] farben = getResources().getStringArray(R.array.farben);
		this.spin_farbe.setSelection(getFarbIndex(farben));
	}

	protected int getFarbIndex(String[] farben) {
		for (int i = 0; i < farben.length; i++) {
			if(this.spieler.getSpielfigur().getFarbe().compare(farben[i])){
				return i;
			}
		}
		return -1;
	}

	protected void checkInputAndSave() {
		this.spieler.getSpielfigur().setVergeben(false);
		checkInput(this.selectedFarbe, this.selectedForm);
	}
	
	protected void savePlayerSettings(Spielfigur figur) {
		this.spieler.setName(et_name.getText().toString().trim());
		this.spieler.getSpielfigur().setVergeben(false);
		this.spieler.setSpielfigur(figur);
		this.kommunikation.navigieren(SpielerBearbeitenActivity.this, SpielerUebersichtActivity.class);
	}
}
