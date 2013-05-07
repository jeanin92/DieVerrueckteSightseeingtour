package com.dhbw.dvst;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;

public class StartActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.start);
		
		final Button btn_start = (Button) findViewById(R.id.btn_start);
        btn_start.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_modus = new Intent(StartActivity.this, ModusActivity.class);
                StartActivity.this.startActivity(intent_modus);
            }
        });
        
        final Button btn_anleitung = (Button) findViewById(R.id.btn_anleitung);
        btn_anleitung.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_modus = new Intent(StartActivity.this, ModusActivity.class);
                StartActivity.this.startActivity(intent_modus);
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		boolean result = super.onCreateOptionsMenu(menu);
		return result;
	}
}
