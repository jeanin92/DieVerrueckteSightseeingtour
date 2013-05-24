package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.helper.KommunikationActivities;
import com.dhbw.dvst.helper.SimpleErrorMessage;
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
		et_name = (EditText) findViewById(R.id.et_name);
		et_name.setText(spieler.getName());
		
		initFarbspinner();		
		initFormspinner();
		
		final Button btn_neu = (Button) findViewById(R.id.btn_erstellen);
        btn_neu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {        
            	if(SpielerBearbeitenActivity.this.et_name.getText().toString().trim().length() == 0){
            		SpielerBearbeitenActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
            	}
            	else if(SpielerBearbeitenActivity.this.spin_farbe.getSelectedItem()==null ||
            			SpielerBearbeitenActivity.this.spin_form.getSelectedItem()==null){
            		new SimpleErrorMessage(SpielerBearbeitenActivity.this, getString(R.string.err_nichts_selektiert));
            	}
            	else{
            		figurPrüfen();            		
            	}           	
            }
        });
	}

	protected void initFormspinner() {
		spin_form = (Spinner) findViewById(R.id.spin_figur);		
		ArrayAdapter<CharSequence> adapt_figur = ArrayAdapter.createFromResource(this, R.array.figuren, android.R.layout.simple_spinner_item);
		spin_form.setAdapter(adapt_figur);
		String[] formen = getResources().getStringArray(R.array.figuren);
		spin_form.setSelection(getFormIndex(formen));
	}

	protected void initFarbspinner() {
		spin_farbe = (Spinner) findViewById(R.id.spin_farbe);
		ArrayAdapter<CharSequence> adapt_farbe = ArrayAdapter.createFromResource(this, R.array.farben, android.R.layout.simple_spinner_item);
		spin_farbe.setAdapter(adapt_farbe);
		String[] farben = getResources().getStringArray(R.array.farben);
		spin_farbe.setSelection(getFarbIndex(farben));
	}

	protected int getFarbIndex(String[] farben) {
		for (int i = 0; i < farben.length; i++) {
			if(spieler.getSpielfigur().getFarbe().compare(farben[i])){
				return i;
			}
		}
		return -1;
	}
	
	protected int getFormIndex(String[] formen) {
		for (int i = 0; i < formen.length; i++) {
			if(spieler.getSpielfigur().getForm().compare(formen[i])){
				return i;
			}
		}
		return -1;
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
		for (Spielfigur figur : spiel.getAlleSpielfiguren()) {            			
			if(figur.getFarbe().compare(spin_farbe.getSelectedItem().toString()) &
					figur.getForm().compare(spin_form.getSelectedItem().toString())){
				if(figur.isVergeben()){
					new SimpleErrorMessage(SpielerBearbeitenActivity.this, getString(R.string.err_vergeben));
				}
				else{
					spieler.setName(et_name.getText().toString().trim());
					spieler.setSpielfigur(figur);
					kommunikation.navigieren(SpielerBearbeitenActivity.this, SpielerUebersichtActivity.class);
				}
			}
		}
	}
}
