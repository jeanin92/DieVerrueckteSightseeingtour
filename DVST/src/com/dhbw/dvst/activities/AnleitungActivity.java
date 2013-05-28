package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.dhbw.dvst.R;
import com.dhbw.dvst.models.Spiel;
import com.dhbw.dvst.utilities.ActivityInteraction;

public class AnleitungActivity extends Activity {
	private ActivityInteraction kommunikation = new ActivityInteraction();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.anleitung);
		
		final Button btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Spiel.resetInstance();
            	kommunikation.navigieren(AnleitungActivity.this, ModusActivity.class);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean result = super.onCreateOptionsMenu(menu);
		return result;
	}
	
	@Override
	public void onConfigurationChanged(Configuration newConfig) {
	  // ignore orientation/keyboard change
	  super.onConfigurationChanged(newConfig);
	}
}
