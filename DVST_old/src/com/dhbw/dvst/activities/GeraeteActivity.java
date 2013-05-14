package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

import com.dhbw.dvst.R;

public class GeraeteActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.geraete);
		
		final Button btn_ok = (Button) findViewById(R.id.btn_ok);
		final RadioButton rb_eins = (RadioButton) findViewById(R.id.rb_eins);
		final RadioButton rb_mehrere = (RadioButton) findViewById(R.id.rb_mehrere);
        btn_ok.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	if (rb_eins.isChecked()){
            		//TODO: modus setzen
            	}
            	else if(rb_mehrere.isChecked()){
            		//TODO: modus setzen
            	}
                Intent intent_spieler = new Intent(GeraeteActivity.this, SpielerUebersichtActivity.class);
                GeraeteActivity.this.startActivity(intent_spieler);
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
