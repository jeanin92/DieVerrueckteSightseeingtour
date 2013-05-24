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
import com.dhbw.dvst.model.Spielfigur;

public class SpielerActivity extends Activity {
	private Spiel spiel = Control.getInstance();
	private KommunikationActivities kommunikation = new KommunikationActivities();
	private EditText et_name;
	private Spinner spin_farbe;
	private Spinner spin_form;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spieler_einfuegen);
		
		setSpielerListItem();
		
		final Button btn_erstellen = (Button) findViewById(R.id.btn_erstellen);
        setErstellenListener(btn_erstellen);
	}

	private void setSpielerListItem() {
		this.et_name = (EditText) findViewById(R.id.et_name);
		
		SpinnerBuilder spinbuild = new SpinnerBuilder();
		this.spin_farbe = spinbuild.initFarbspinner(this);
		this.spin_form = spinbuild.initFormspinner(this);
	}

	protected void setErstellenListener(final Button btn_erstellen) {
		btn_erstellen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) { 
            	if(SpielerActivity.this.et_name.getText().toString().trim().length() == 0){
            		SpielerActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
            	}
            	else if(SpielerActivity.this.spin_farbe.getSelectedItem()==null ||
            			SpielerActivity.this.spin_form.getSelectedItem()==null){
            		new Fehlermeldung(SpielerActivity.this, getString(R.string.err_nichts_selektiert));
            	}
            	else{
            		figurPrüfen();            		
            	}           	
            }
        });
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

	protected void figurPrüfen() {
		for (Spielfigur figur : this.spiel.getAlleSpielfiguren()) {            			
			if(figur.getFarbe().compare(this.spin_farbe.getSelectedItem().toString()) &
					figur.getForm().compare(this.spin_form.getSelectedItem().toString())){
				if(figur.isVergeben()){
					new Fehlermeldung(SpielerActivity.this, getString(R.string.err_vergeben));
				}
				else{
					this.spiel.spielerHinzufuegen(this.et_name.getText().toString().trim(), figur);
					this.kommunikation.navigieren(SpielerActivity.this, SpielerUebersichtActivity.class);
				}
			}
		}
	}
}
