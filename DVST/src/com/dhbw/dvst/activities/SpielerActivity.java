package com.dhbw.dvst.activities;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.dhbw.dvst.R;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;

public class SpielerActivity extends Activity {
	private Spiel spiel = Control.getInstance();
	private EditText et_name;
	private Spinner spin_farbe;
	private Spinner spin_figur;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spieler);
		
		final Button btn_neu = (Button) findViewById(R.id.btn_erstellen);
		et_name = (EditText) findViewById(R.id.et_name);
		spin_farbe = (Spinner) findViewById(R.id.spin_farbe);
		spin_figur = (Spinner) findViewById(R.id.spin_figur);
        btn_neu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {            	
            	if(SpielerActivity.this.et_name.getText()==null ||
            			SpielerActivity.this.et_name.getText().toString().equals("")){
            		SpielerActivity.this.et_name.setError(getString(R.string.err_eingabe_leer));
            	}
            	else if(SpielerActivity.this.spin_farbe.getSelectedItem()==null ||
            			SpielerActivity.this.spin_figur.getSelectedItem()==null){
            		AlertDialog.Builder builder = new AlertDialog.Builder(getParent());
            		builder.setMessage(getString(R.string.err_nichts_selektiert))
            			.setCancelable(true);
            		AlertDialog alert = builder.create();
            		alert.show();
            	}
            	else{
//            		spiel.spielerHinzufuegen(name, spielfigur);
            		Intent intent_spieler = new Intent(SpielerActivity.this, SpielerActivity.class);
            		SpielerActivity.this.startActivity(intent_spieler);
            	}           	
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  // ignore orientation/keyboard change
	  super.onConfigurationChanged(newConfig);
	}

}
