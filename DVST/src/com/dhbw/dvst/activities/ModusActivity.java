package com.dhbw.dvst.activities;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

import com.dhbw.dvst.R;
import com.dhbw.dvst.helper.KommunikationActivities;

public class ModusActivity extends Activity {
	private KommunikationActivities kommunikation = new KommunikationActivities();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modus);
		
		final Button btn_mehrspieler = (Button) findViewById(R.id.btn_mehrspieler);
        setMehrspielerListener(btn_mehrspieler);
        
        final Button btn_einspieler = (Button) findViewById(R.id.btn_einspieler);
        setEinspielerListener(btn_einspieler);
	}

	protected void setEinspielerListener(final Button btn_einspieler) {
		btn_einspieler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO: einspieler modus
            }
        });
	}

	protected void setMehrspielerListener(final Button btn_mehrspieler) {
		btn_mehrspieler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
            	kommunikation.navigieren(ModusActivity.this, GeraeteActivity.class);
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
