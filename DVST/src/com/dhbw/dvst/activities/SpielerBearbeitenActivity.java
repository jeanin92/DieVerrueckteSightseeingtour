package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.helper.KommunikationActivities;
import com.dhbw.dvst.helper.Fehlermeldung;
import com.dhbw.dvst.helper.SpinnerBuilder;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;
import com.dhbw.dvst.model.Spieler;
import com.dhbw.dvst.model.Spielfigur;

public class SpielerBearbeitenActivity extends Activity{
	private Spiel spiel = Control.getInstance();
	private KommunikationActivities kommunikation = new KommunikationActivities();
	private int spieler_index;
	private Spieler spieler;
	private EditText et_name;
	private Spinner spin_farbe;
	private Spinner spin_form;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spieler_bearbeiten);
		this.spieler_index = getIntent().getIntExtra("spieler_index", 0);
		spieler = spiel.getAlleSpieler().get(spieler_index);
		
		setSpielerListItem();
		
		final Button btn_neu = (Button) findViewById(R.id.btn_erstellen);
        btn_neu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(SpielerBearbeitenActivity.this.et_name.getText().toString().trim().length() == 0){
            		SpielerBearbeitenActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
            	}
            	else if(SpielerBearbeitenActivity.this.spin_farbe.getSelectedItem()==null ||
            			SpielerBearbeitenActivity.this.spin_form.getSelectedItem()==null){
            		new Fehlermeldung(SpielerBearbeitenActivity.this, getString(R.string.err_nichts_selektiert));
            	}
            	else{
            		figurPrüfen();            		
            	}           	
            }
        });
	}

	private void setSpielerListItem() {
		et_name = (EditText) findViewById(R.id.et_name);
		et_name.setText(spieler.getName());	
		SpinnerBuilder spinbuild = new SpinnerBuilder();
		spin_farbe = spinbuild.initFarbspinner(this);
		setFarbspinner();
		spin_form = spinbuild.initFormspinner(this);
		setFormspinner();
	}

	protected void setFormspinner() {
		String[] formen = getResources().getStringArray(R.array.figuren);
		this.spin_form.setSelection(getFormIndex(formen));
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
	
	protected int getFormIndex(String[] formen) {
		for (int i = 0; i < formen.length; i++) {
			if(this.spieler.getSpielfigur().getForm().compare(formen[i])){
				return i;
			}
		}
		return -1;
	}

	protected void figurPrüfen() {
		this.spieler.getSpielfigur().setVergeben(false);
		for (Spielfigur figur : spiel.getAlleSpielfiguren()) {            			
			if(figur.getFarbe().compare(this.spin_farbe.getSelectedItem().toString()) &
					figur.getForm().compare(this.spin_form.getSelectedItem().toString())){
				if(figur.isVergeben()){
					new Fehlermeldung(SpielerBearbeitenActivity.this, getString(R.string.err_vergeben));
				}
				else{
					this.spieler.setName(et_name.getText().toString().trim());
					this.spieler.getSpielfigur().setVergeben(false);
					this.spieler.setSpielfigur(figur);
					this.kommunikation.navigieren(SpielerBearbeitenActivity.this, SpielerUebersichtActivity.class);
				}
			}
		}
	}
	
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
