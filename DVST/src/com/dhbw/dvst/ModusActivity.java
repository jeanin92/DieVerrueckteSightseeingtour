package com.dhbw.dvst;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class ModusActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.modus);
		
		final Button btn_mehrspieler = (Button) findViewById(R.id.btn_mehrspieler);
        btn_mehrspieler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_geraete = new Intent(ModusActivity.this, GeraeteActivity.class);
                ModusActivity.this.startActivity(intent_geraete);
            }
        });
        
        final Button btn_einspieler = (Button) findViewById(R.id.btn_einspieler);
        btn_einspieler.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO: einspieler modus
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
