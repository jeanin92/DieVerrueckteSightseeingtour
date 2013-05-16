package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.dhbw.dvst.R;
import com.dhbw.dvst.model.Control;
import com.dhbw.dvst.model.Spiel;

public class SpielerUebersichtActivity extends Activity {
	private Spiel spiel = Control.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.spieler_uebersicht);
		
		final Button btn_neu = (Button) findViewById(R.id.btn_neu);
        btn_neu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent intent_spieler = new Intent(SpielerUebersichtActivity.this, SpielerActivity.class);
            	SpielerUebersichtActivity.this.startActivity(intent_spieler);
            }
        });
        
        final Button btn_modus_wechseln = (Button) findViewById(R.id.btn_modus_wechseln);
        btn_modus_wechseln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Intent intent_modus = new Intent(SpielerUebersichtActivity.this, ModusActivity.class);
            	SpielerUebersichtActivity.this.startActivity(intent_modus);
            }
        });
        
        final Button btn_zum_spiel = (Button) findViewById(R.id.btn_zum_spiel);
        btn_zum_spiel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO: zum Spiel
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
