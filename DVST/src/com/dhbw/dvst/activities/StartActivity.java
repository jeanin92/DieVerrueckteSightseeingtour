package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.dhbw.dvst.R;
import com.dhbw.dvst.helper.KommunikationActivities;
import com.dhbw.dvst.model.Control;

public class StartActivity extends Activity {
	private KommunikationActivities kommunikation = new KommunikationActivities();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		final Button btn_start = (Button) findViewById(R.id.btn_start);
        setStartButtonListener(btn_start);
        
        final Button btn_anleitung = (Button) findViewById(R.id.btn_anleitung);
        setAnleitungButtonListener(btn_anleitung);
	}
	
	protected void setAnleitungButtonListener(final Button btn_anleitung) {
		btn_anleitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	kommunikation.navigieren(StartActivity.this, AnleitungActivity.class);
            }
        });
	}

	protected void setStartButtonListener(final Button btn_start) {
		btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	Control.resetInstance();
                kommunikation.navigieren(StartActivity.this, ModusActivity.class);
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
	  super.onConfigurationChanged(newConfig);
	}
}
