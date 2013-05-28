package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import com.dhbw.dvst.R;
import com.dhbw.dvst.adapters.PlayerListArrayAdapter;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;
import com.dhbw.dvst.utilities.Fehlermeldung;

public class SpielerUebersichtActivity extends Activity {
	private Spiel spiel = Spiel.getInstance();
	private ActivityInteraction kommunikation = new ActivityInteraction();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.spieler_uebersicht);
		final ListView listview = (ListView) findViewById(R.id.lv_spieler);
        setSpielerliste(listview);
		
		final Button btn_neu = (Button) findViewById(R.id.btn_neu);
        setNeuButtonListener(btn_neu);
        
        final Button btn_modus_wechseln = (Button) findViewById(R.id.btn_modus_wechseln);
        setModuswechselListener(btn_modus_wechseln);
        
        final Button btn_zum_spiel = (Button) findViewById(R.id.btn_zum_spiel);
        setZumSpielListener(btn_zum_spiel);
	}

	protected void setSpielerliste(final ListView listview) {
		final PlayerListArrayAdapter adapter = new PlayerListArrayAdapter(this, 
        		R.layout.zeilenansicht, R.id.tv_gewaehlter_name, spiel.getAlleSpieler());
        listview.setAdapter(adapter);
	}

	protected void setZumSpielListener(final Button btn_zum_spiel) {
		btn_zum_spiel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO: zum Spiel
            }
        });
	}

	protected void setModuswechselListener(final Button btn_modus_wechseln) {
		btn_modus_wechseln.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	kommunikation.navigieren(SpielerUebersichtActivity.this, ModusActivity.class);
            }
        });
	}

	protected void setNeuButtonListener(final Button btn_neu) {
		btn_neu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if(spiel.getAlleSpieler().size() == 6) {
            		new Fehlermeldung(SpielerUebersichtActivity.this, getString(R.string.err_max_spieleranzahl));
                	}
            	else {
            		kommunikation.navigieren(SpielerUebersichtActivity.this, SpielerAnlegenActivity.class);
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
	
	@Override
	protected void onResume() {
		super.onResume();
	}
	
}


