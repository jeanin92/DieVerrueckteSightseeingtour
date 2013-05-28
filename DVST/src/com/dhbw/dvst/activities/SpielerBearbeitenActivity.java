package com.dhbw.dvst.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spieler;
import com.dhbw.dvst.models.Spielfigur;
import com.dhbw.dvst.views.SpielerView;

public class SpielerBearbeitenActivity extends SpielerActivity{
	private int spieler_index;
	private Spieler spieler;
	private SpielerView view;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		view = (SpielerView)View.inflate(this, R.layout.spieler, null);
		view.setViewListener(viewListener);
		setContentView(view);
		
		this.spieler_index = getIntent().getIntExtra("spieler_index", 0);
		this.spieler = spiel.getAlleSpieler().get(spieler_index);

		makeSpinners();
		
		//TODO: here oder in View?
		TextView spielerSettingsHeading = (TextView) findViewById(R.id.hd_spieler);
		spielerSettingsHeading.setText(R.string.spieler_erstellen);
		
		this.et_name.setText(spieler.getName());
		setFarbspinner();
		setFormspinner();
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
