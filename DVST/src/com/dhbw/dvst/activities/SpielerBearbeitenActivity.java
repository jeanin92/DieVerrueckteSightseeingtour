package com.dhbw.dvst.activities;

import android.os.Bundle;

import com.dhbw.dvst.R;
import com.dhbw.dvst.model.Spieler;
import com.dhbw.dvst.model.Spielfigur;

public class SpielerBearbeitenActivity extends SpielerActivity{
	private int spieler_index;
	private Spieler spieler;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spieler_bearbeiten);
		
		this.spieler_index = getIntent().getIntExtra("spieler_index", 0);
		this.spieler = spiel.getAlleSpieler().get(spieler_index);

		buildPlayerSettingsDialogue();
		
		this.et_name.setText(spieler.getName());
		
		setFarbspinner();
		setFormspinner();
		setSaveButton();
	}


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
		checkInput();
	}
	
	protected void savePlayerSettings(Spielfigur figur) {
		this.spieler.setName(et_name.getText().toString().trim());
		this.spieler.getSpielfigur().setVergeben(false);
		this.spieler.setSpielfigur(figur);
		this.kommunikation.navigieren(SpielerBearbeitenActivity.this, SpielerUebersichtActivity.class);
	}

}
